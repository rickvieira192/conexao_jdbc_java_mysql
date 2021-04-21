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

// Modo atual de conexão com banco JDBC	
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

	// 1 DENIFIR PARÂMETROS PARA SE CONECTAR AO BANCO MYSQL
	// trecho do properties
	
// Modo de maior facilidade para manutenção e troca de banco de dados

	public static void main(String[] args) {
		String driver = "mysql";
		String dataBaseAdress = "127.0.0.1:3306"; // ou "127.0.0.1:3306"; ou "localhost:3306"
		String dataBaseName = "nome do banco";
		String user = "root";
		String password = "senha";

		// 2 CONSTRUÇÃO DA STRING DE CONEXÃO

		StringBuilder sb = new StringBuilder("jdbc:").append(driver).append("://").append(dataBaseAdress).append("/")
				.append(dataBaseName);

		String connectionUrl = sb.toString();
		{ // sb.toString = "jdbc:mysql://localhost/db_digital_innovation"

			// Carregar a classe específica de implementação do driver na memória da JVM. (A
			// partir da versão
			// JDBC 4 não é mais necessário)

			// criar conexão usando o DriverManager passando os parâmetros (string de
			// conexão, usuario e senha)
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
