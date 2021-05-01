package odev3;

public class Main {
	// 01.05.2021

	public static void main(String[] args) {
		Course course = new Course();
		course.setCourseId(3);
		course.setCourseName("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");

		Instructor lecturer = new Instructor();
		lecturer.setLecturerFirstName("Engin");
		lecturer.setLecturerLastName("Demiro�");
		lecturer.setUserId(1);

		CourseManager courseManager = new CourseManager(lecturer);

		InstructorManager instructorManager = new InstructorManager(lecturer);
		instructorManager.addCourse(course);

		System.out.println("*************************************************");

		System.out.println("E�itmen taraf�ndan a��lan b�t�n kurslar.");

		for (Course lesson : instructorManager.getAllLecturerCourse()) {
			System.out.println(lesson.getCourseName());
		}

	}

}
