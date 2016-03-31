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
	
	public static ResultSet executeQuery(String q) {
		Connection conn=connector();
		ResultSet rs = null;
		try {
		String query=q;
		PreparedStatement pst=conn.prepareStatement(query);
		rs = pst.executeQuery();
		pst.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
}
