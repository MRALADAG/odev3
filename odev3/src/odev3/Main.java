package odev3;

public class Main {

	public static void main(String[] args) {
		Course course = new Course();
		course.setCourseId(3);
		course.setCourseName("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");

		Instructor lecturer = new Instructor();
		lecturer.setLecturerFirstName("Engin");
		lecturer.setLecturerLastName("Demiroð");
		lecturer.setUserId(1);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(course);

	}

}
