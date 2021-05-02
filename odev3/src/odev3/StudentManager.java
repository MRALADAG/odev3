package odev3;

public class StudentManager extends UserManager {

	private Student student;

	public StudentManager(Student student) {
		this.student = student;
	}

	public void enrollCourse(Course course) {
		System.out.println("Sayın " + student.getStudentFirstName() + " " + student.getStudentLastName() + " "
				+ course.getCourseName() + " isimli kursa başarıyla kayıt oldunuz.");
	}

	public void courseDisenrollment(Course course) {
		System.out.println("Sayın " + student.getStudentFirstName() + " " + student.getStudentLastName() + " "
				+ course.getCourseName() + " isimli kurstan kaydınız isteğiniz üzerine silinmiştir.");
	}
}
