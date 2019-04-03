package br.com.greco.config;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Conector {

	public static Connection getConnection() throws SQLException,ClassNotFoundException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = null;
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","RM80957","280396");
		con.close();

		return con;
	}

}
