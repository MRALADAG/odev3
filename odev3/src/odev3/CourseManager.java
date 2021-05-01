package odev3;

public class CourseManager {
	public CourseManager() {

	}

	public CourseManager(Course[] course, Instructor instructor) {
		for (Course course2 : course) {
			System.out.println(course2.getCourseName() + " " + instructor.getLecturerFirstName() + " "
					+ instructor.getLecturerLastName());
		}
	}

	public void enrollCourse(Course course) {
		System.out.println(course.getCourseName() + " isimli kursa baþarýyla kayýt oldunuz.");
		System.out.println("Ýlerleme Durumu: " + course.getProgressionState());
	}

	public void disEnrollmentCourse(Course course) {
		System.out.println(course.getCourseName() + " isimli kurstan kaydýnýz isteðiniz üzerine silinmiþtir.");
	}
}
