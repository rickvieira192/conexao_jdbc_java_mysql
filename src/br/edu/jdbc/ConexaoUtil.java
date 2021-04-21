
//Isso é um padrão de projeto, onde ele não deixa o mesmo objeto ser instanciado duas vezes
//if(conexaoUtil == null) {
			//conexaoUtil = new ConexaoUtil();
		     //} 
//Pois se existe uma conexão, ele vai retornar ela para nós.

package br.edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoUtil {

	
	//criação do objeto estático
	private static ConexaoUtil conexaoUtil;
	//criação do método estático
	public static ConexaoUtil getInstance() {
		//if verifica se já existe um objeto instanciado dentro da aplicação
		if(conexaoUtil == null) {
			//Se não for nulo ele vai instanciar o objeto
			conexaoUtil = new ConexaoUtil();
		} 
		// E assim ele irá retornar a conexaoUtil
		return conexaoUtil;
	}
	
	//criação do objeto connection que é da classe(pacote) "import java.sql.Connection"
	//É essa classe que irá fazer a conexão com o banco
	//Acima criamos o objeto, abaixo criamos a parte que irá fazer a conexão com o banco
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		//getConnection pede os dados para conectar ao banco passando parâmetros
		//Conexao + banco + caminho + porta + nome do banco + usuario + senha
		//jdbc:mysql://127.0.0.1:3306/db_digital_innovation","root","Rickle1211"
		//Depois isso retornará erros de exceções 
		return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/nome do banco","root","senha"); 
		
	}
	
	//Testando conexao 
	//Tratar erros com try/catch
	
	public static void main(String[]args) {
		try {
		System.out.println(getInstance().getConnection());
		}catch (Exception e) {
			e.printStackTrace();
			}
		} 
	
}
