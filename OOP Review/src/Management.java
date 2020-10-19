
public interface Management {
	public abstract User getUser(int id);
	public abstract boolean addUser(User user);
	public abstract void modifyUser(int id, boolean type);
	public abstract boolean deleteUser(int id);
}
