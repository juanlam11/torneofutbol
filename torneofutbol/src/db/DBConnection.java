package db;

import java.sql.*;

import javax.swing.JOptionPane;

public class DBConnection {
	
	Connection c=null;
	
	public DBConnection(){
	try {
		Class.forName("org.sqlite.JDBC");
		c=DriverManager.getConnection("jdbc:sqlite:db/base.db");
	}catch (Exception e) {
		System.err.println(e.getClass().getName() + ": " + e.getMessage());
		System.exit(0);
	}
	JOptionPane msgbox= new JOptionPane();
	System.out.println("Base de datos abierta exitosamente!");
	JOptionPane.showMessageDialog(msgbox, "Base de datos abierta exitosamente!");
	}
}
