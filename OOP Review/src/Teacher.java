import java.sql.Date;

public class Teacher extends User {
	
	private String faculty;
	
	public Teacher(int id, String fullName, Date birthday, String faculty) {
		super(id, fullName, birthday);
		this.id = id;
		this.fullName = fullName;
		this.birthday = birthday;
		this.faculty = faculty;
	}

	@Override
	public void work() {
		System.out.println("Teacher is teaching!");
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	

}
