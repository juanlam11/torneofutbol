package db;

import java.sql.*;

public class DBConnection {

	public static Connection connector(){
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn=DriverManager.getConnection("jdbc:sqlite:db/base.db");
			return conn;
		}catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
			return null;
		}
	}
}
