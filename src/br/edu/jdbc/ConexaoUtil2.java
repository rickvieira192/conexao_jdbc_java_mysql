package br.edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoUtil2 {

	/*
	 * public static void main(String[] args) {
	 * 
	 * String urlConnection = "jdbc:mysql://127.0.0.1:3306/nome_do_banco";
	 * 
	 * Connection comm = null;
	 * 
	 * try { comm = DriverManager.getConnection(urlConnection, "root",
	 * "senha"); System.out.println("Sucesso!"); } catch (Exception e) {
	 * System.out.println("Falha!"); } finally { try { comm.close(); } catch
	 * (SQLException e) { e.printStackTrace(); } }
	 * 
	 * }
	 */

// Modo atual de conex�o com banco JDBC	
//	@SuppressWarnings("unused")
	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * String urlConnection = "jdbc:mysql://127.0.0.1:3306/db_digital_innovation";
	 * 
	 * try {Connection comm = DriverManager.getConnection(urlConnection, "root",
	 * "Rickle1211"); System.out.println("Sucesso!"); } catch (Exception e) {
	 * System.out.println("Falha!"); }
	 * 
	 * }
	 */

	// 1 DENIFIR PAR�METROS PARA SE CONECTAR AO BANCO MYSQL
	// trecho do properties
	
// Modo de maior facilidade para manuten��o e troca de banco de dados

	public static void main(String[] args) {
		String driver = "mysql";
		String dataBaseAdress = "127.0.0.1:3306"; // ou "127.0.0.1:3306"; ou "localhost:3306"
		String dataBaseName = "nome do banco";
		String user = "root";
		String password = "senha";

		// 2 CONSTRU��O DA STRING DE CONEX�O

		StringBuilder sb = new StringBuilder("jdbc:").append(driver).append("://").append(dataBaseAdress).append("/")
				.append(dataBaseName);

		String connectionUrl = sb.toString();
		{ // sb.toString = "jdbc:mysql://localhost/db_digital_innovation"

			// Carregar a classe espec�fica de implementa��o do driver na mem�ria da JVM. (A
			// partir da vers�o
			// JDBC 4 n�o � mais necess�rio)

			// criar conex�o usando o DriverManager passando os par�metros (string de
			// conex�o, usuario e senha)
			try {
				Connection comm = DriverManager.getConnection(connectionUrl, user, password);
				System.out.println("Sucesso ao se conectar ao banco");
			} catch (Exception e) {
				System.out.println("Falha ao se conectar ao banco");
				e.printStackTrace();
			}

		}
	}
}
