import java.util.Date;

public abstract class User {
	
	protected int id;
	protected String fullName;
	protected Date birthday;
	
	public User(int id, String fullName, Date birthday) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.birthday = birthday;
	}

	public abstract void work();
	
	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getFullName() {
		return fullName;
	}

	protected void setFullName(String fullName) {
		this.fullName = fullName;
	}

	protected Date getBirthday() {
		return birthday;
	}

	protected void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
