package db;

import java.sql.*;

public class DBConnection {
	
	Connection c=null;
	boolean baseAbierta=false;
	
	public DBConnection(){
	try {
		Class.forName("org.sqlite.JDBC");
		c=DriverManager.getConnection("jdbc:sqlite:db/base.db");
	}catch (Exception e) {
		System.err.println(e.getClass().getName() + ": " + e.getMessage());
		System.exit(0);
	}
	baseAbierta=true;
	System.out.println("Base de datos abierta exitosamente!");
	}
}
