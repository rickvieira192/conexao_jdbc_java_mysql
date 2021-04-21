
//Isso � um padr�o de projeto, onde ele n�o deixa o mesmo objeto ser instanciado duas vezes
//if(conexaoUtil == null) {
			//conexaoUtil = new ConexaoUtil();
		     //} 
//Pois se existe uma conex�o, ele vai retornar ela para n�s.

package br.edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoUtil {

	
	//cria��o do objeto est�tico
	private static ConexaoUtil conexaoUtil;
	//cria��o do m�todo est�tico
	public static ConexaoUtil getInstance() {
		//if verifica se j� existe um objeto instanciado dentro da aplica��o
		if(conexaoUtil == null) {
			//Se n�o for nulo ele vai instanciar o objeto
			conexaoUtil = new ConexaoUtil();
		} 
		// E assim ele ir� retornar a conexaoUtil
		return conexaoUtil;
	}
	
	//cria��o do objeto connection que � da classe(pacote) "import java.sql.Connection"
	//� essa classe que ir� fazer a conex�o com o banco
	//Acima criamos o objeto, abaixo criamos a parte que ir� fazer a conex�o com o banco
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		//getConnection pede os dados para conectar ao banco passando par�metros
		//Conexao + banco + caminho + porta + nome do banco + usuario + senha
		//jdbc:mysql://127.0.0.1:3306/db_digital_innovation","root","Rickle1211"
		//Depois isso retornar� erros de exce��es 
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
