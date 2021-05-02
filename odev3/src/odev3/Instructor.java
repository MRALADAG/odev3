package odev3;

public class Instructor extends User {

	private String lecturerFirstName;
	private String lecturerLastName;

	public Instructor() {

	}

	public Instructor(String lecturerFirstName, String lecturerLastName) {
		this.lecturerFirstName = lecturerFirstName;
		this.lecturerLastName = lecturerLastName;
	}

}
