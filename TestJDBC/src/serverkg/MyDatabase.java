package serverkg;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDatabase extends JDBCAdapter {
	private Connection conn;
	public MyDatabase() {
		this.conn = getConnection();
		System.out.println("Connected to database");
	}
	public String get(String str) {
		
		try {
			Statement stmt = conn.createStatement();
			//String strQuery = String.format("SELECT * FROM tbltest WHERE source like \'%%%s%%\'", str);
			String strQuery = "SELECT * FROM tbltest";
			ResultSet rs = stmt.executeQuery(strQuery);
			while(rs.next()) {
				if(rs.getString(2).equalsIgnoreCase(str))
					return rs.getString(3);
			}
			return "No solution";
		} catch (SQLException e) {
			return "Error!";
		}
	}
	public boolean post(String str) {
		return false;
	}
	public boolean put(String input, String value) {
		return false;
	}
	public boolean delete(String str) {
		return false;
	}
}
