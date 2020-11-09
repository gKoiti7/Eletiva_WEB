package Conexao_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
	public static Connection getConnection() throws SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/base_dados?useTimezone=true&serverTimezone=UTC", "root", "gustavokoiti7");
			
		}catch(ClassNotFoundException e) {
			throw new SQLException(e.getException());
		}
	}

}
