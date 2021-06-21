package application;

import java.text.ParseException;

import model.domain.Aluno;
import model.repositorios.AlunoDao;
import model.repositorios.FabricaConexao;

public class Main {

	public static void main(String[] args) throws ParseException {
		Aluno a = new Aluno(3049451, "Fernanda", "Feminino", "12/04/2004", 55);
		a.infoAluno();
		
		AlunoDao alunoD = new AlunoDao();
		alunoD.criarConexao();
		alunoD.criarAluno(a);
		alunoD.fecharConexao();
		
	}

}
