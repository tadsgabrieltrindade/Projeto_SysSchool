package model.repositorios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class FabricaConexao {
	public static Connection conexao;
	
	public Connection criarConexao() {
		if(conexao == null) {
			try {
				String url = "jdbc:mariadb://localhost/sysschool";
				Properties props = new Properties();
				props.setProperty("user", "root");
				props.setProperty("password", "root");
				props.setProperty("ssl", "false");
				conexao = DriverManager.getConnection(url, props);
				System.out.println("Conex�o criada com sucesso com o banco de dados!");
				
			} catch (Exception e) {
				System.out.println("Falha ao criar conex�o!\nMensagem: " + e.getMessage());
			}		
		}
		return conexao;
	}
	
	public void fecharConexao() {
		try {
			if(conexao != null) {
				conexao.close();
				conexao = null;
			}
			System.out.println("Conex�o fechada com sucesso!");
			
		} catch (Exception e) {
			System.out.println("Erro ao fechar conex�o!\nMensagem: " + e.getMessage());
		}
	}
}
