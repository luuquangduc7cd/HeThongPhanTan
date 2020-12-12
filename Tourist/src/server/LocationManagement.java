package server;

public class LocationManagement {
	private DatabaseAdapter db;
	
	public LocationManagement() {
		db = new DatabaseAdapter();
	}
	
	public String getNearestLocationFrom(int x, int y) {
		String result = "";
		db.openConnection();
		result = db.getNearestLocationFrom(x, y);
		db.closeConnection();
		return result;
	}
	
}
