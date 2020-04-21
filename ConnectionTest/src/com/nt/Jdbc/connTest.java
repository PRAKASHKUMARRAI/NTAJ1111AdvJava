package com.nt.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//register JDBC driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//connection established
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		if(con!=null) {
			System.out.println("Connection established");
		}
		else {
			System.out.println("Connection failed");
		}

	}

}
