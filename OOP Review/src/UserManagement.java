import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserManagement implements Management {
	
	List<User> users;
	
	public UserManagement() {
		users = new ArrayList<User>();
	}

	@Override
	public User getUser(int id) {
		for (User user : users) {
			if(user.getId() == id)
				return user;
		}
		return null;
	}

	@Override
	public boolean addUser(User usr) {
		for (User user : users) {
			if(user.getId() == usr.id)
				return false;
		}
		users.add(usr);
		return true;
	}

	@Override
	public void modifyUser(int id, boolean isStudent) {

	}

	@Override
	public boolean deleteUser(int id) {
		for (User user : users) {
			if(user.getId() == id)
				users.remove(user);
				return true;
		}
		return false;
	}



}
