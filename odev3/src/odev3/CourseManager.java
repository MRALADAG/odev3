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
		System.out.println(course.getCourseName() + " isimli kursa ba�ar�yla kay�t oldunuz.");
		System.out.println("�lerleme Durumu: " + course.getProgressionState());
	}

	public void disEnrollmentCourse(Course course) {
		System.out.println(course.getCourseName() + " isimli kurstan kayd�n�z iste�iniz �zerine silinmi�tir.");
	}
}
