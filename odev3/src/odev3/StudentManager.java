package odev3;

public class StudentManager extends UserManager {

	private Student student;

	public StudentManager(Student student) {
		this.student = student;
	}

	public void enrollCourse(Course course) {
		System.out.println("Say�n " + student.getStudentFirstName() + " " + student.getStudentLastName() + " "
				+ course.getCourseName() + " isimli kursa ba�ar�yla kay�t oldunuz.");
	}

	public void courseDisenrollment(Course course) {
		System.out.println("Say�n " + student.getStudentFirstName() + " " + student.getStudentLastName() + " "
				+ course.getCourseName() + " isimli kurstan kayd�n�z iste�iniz �zerine silinmi�tir.");
	}
}
