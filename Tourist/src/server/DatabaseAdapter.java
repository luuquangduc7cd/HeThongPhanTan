package server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseAdapter {
	private final String HOST = "localhost";
	private final String PORT = "3306";
	private final String DATABASE = "tourist";
	private final String USR = "root";
	private final String PWD = "admin";
	private Connection conn;
	
	private String url = "";
	
	public DatabaseAdapter() {
		this.url = String.format("jdbc:mysql://%s:%s/%s", HOST, PORT, DATABASE);
	}
	
	public void openConnection() {
		try {
			conn = DriverManager.getConnection(this.url, USR, PWD);
			System.out.println("Database connection is opened");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getNearestLocationFrom(int x1, int y1) {
		double temp = Double.MAX_VALUE;
		String name = "";
		int x2;
		int y2;
		String result = "";
		try {
			Statement stmt = conn.createStatement();
			String strQuery = "SELECT * FROM location";
			ResultSet rs = stmt.executeQuery(strQuery);
			while(rs.next()) {
				name = rs.getString(2);
				x2 = rs.getInt(3);
				y2 = rs.getInt(4);
				double distance = getDistance(x1, y1, x2, y2);
				if(distance < temp) {
					temp = distance;
					result = String.format("%s: (%d, %d)", name, x2, y2);
				}
			}
			return result;
		} catch (SQLException e) {
			return e.toString();
		}
	}
	
	private double getDistance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow((y2 - y1), 2));
	}
}
