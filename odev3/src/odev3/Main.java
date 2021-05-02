package odev3;

public class Main {
	// 01.05.2021

	public static void main(String[] args) {
		Course course = new Course();
		course.setCourseId(3);
		course.setCourseName("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");

		Instructor lecturer = new Instructor();
		lecturer.setUserFirstName("Engin");
		lecturer.setUserLastName("Demiro�");
		lecturer.setUserId(1);
		lecturer.setUserName("EnginDmrg");

		CourseManager courseManager = new CourseManager(lecturer);

		InstructorManager instructorManager = new InstructorManager(lecturer);
		instructorManager.logIn(lecturer);

		instructorManager.addCourse(course);

		instructorManager.logOut(lecturer);

		System.out.println("*************************************************");

		System.out.println("E�itmen taraf�ndan a��lan b�t�n kurslar.");

		for (Course lesson : instructorManager.getAllLecturerCourse()) {
			System.out.println(lesson.getCourseName());
		}

		Student student = new Student("Adem", "Co�kun", 2);
		StudentManager manager = new StudentManager(student);
		manager.enrollCourse(instructorManager.getAllLecturerCourse()[2]);
		System.out.println("------------------------------------------------------------------------------");

		manager.courseDisenrollment(instructorManager.getAllLecturerCourse()[1]);

	}

}
