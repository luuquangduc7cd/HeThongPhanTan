import java.sql.Date;

public class Student extends User {
	private String studentOfClass;

	public Student(int id, String fullName, Date birthday, String studentOfClass) {
		super(id, fullName, birthday);
		this.id = id;
		this.fullName = fullName;
		this.birthday = birthday;
		this.studentOfClass = studentOfClass;
	}

	@Override
	public void work() {
		System.out.println("Student is studying!");		
	}

	public String getStudentOfClass() {
		return studentOfClass;
	}

	public void setStudentOfClass(String studentOfClass) {
		this.studentOfClass = studentOfClass;
	}

	
}
