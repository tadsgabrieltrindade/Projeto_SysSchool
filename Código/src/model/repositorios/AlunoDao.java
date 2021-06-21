package model.repositorios;

import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

import model.domain.Aluno;

public class AlunoDao extends FabricaConexao{
	public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public boolean criarAluno(Aluno aluno) {
		//esse criar aluno fica sem colocar as pks de turmas e notas. É só para testes....
		try {
			String stmt = "INSERT INTO aluno(nome, sexo, data_nascimento) VALUES (?, ?, ?)";
			PreparedStatement pStmt = conexao.prepareStatement(stmt);
			pStmt.setString(1, aluno.getNome());
			pStmt.setString(2, "F");  //testes....
			pStmt.setObject(3, sdf.format(aluno.getDataNascimento()));
			
			pStmt.execute();
			System.out.println("Aluno adicionado com sucesso no banco de dados!");
		} catch (Exception e) {
			System.out.println("Erro ao salvar o aluno!\nMensagem: " + e.getMessage());
			return false;
		}
		return true;
	}
}
