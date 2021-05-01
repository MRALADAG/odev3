package odev3;

public class Instructor extends User {

	private String lecturerFirstName;
	private String lecturerLastName;

	public String getLecturerFirstName() {
		return lecturerFirstName;
	}

	public void setLecturerFirstName(String lecturerFirstName) {
		this.lecturerFirstName = lecturerFirstName;
	}

	public String getLecturerLastName() {
		return lecturerLastName;
	}

	public void setLecturerLastName(String lecturerLastName) {
		this.lecturerLastName = lecturerLastName;
	}

}
