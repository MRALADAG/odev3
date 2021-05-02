package odev3;

public class Student extends User {

	private String studentFirstName;
	private String studentLastName;
	private String userName;
	private int userId;

	public Student() {

	}

	public Student(String studentFirstName, String studentLastName, int userId) {
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.userId = userId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
