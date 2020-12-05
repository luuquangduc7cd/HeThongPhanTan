package serverkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class JDBCAdapter {
	private final String HOST = "localhost";
	private final String PORT = "3306";
	private final String DATABASE = "TestDB";
	private final String USR = "root";
	private final String PWD = "admin";
	
	private String url = "";
	
	public JDBCAdapter() {
		this.url = String.format("jdbc:mysql://%s:%s/%s", HOST, PORT, DATABASE);
	}
	
	protected Connection getConnection() {
		try {
			Connection conn = DriverManager.getConnection(this.url, USR, PWD);
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}