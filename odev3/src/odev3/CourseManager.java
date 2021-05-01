package odev3;

public class CourseManager {

	private Course[] courses;
	private Course course1;
	private Course course2;
	private Instructor instructor;
	private User user;

	public CourseManager(Instructor instructor) {
		this.course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", 89);
		this.course2 = new Course(2, "Programlamaya Giri� i�in Temel Kurs", 100);
		this.courses = new Course[] { course1, course2 };
		this.instructor = instructor;

//		for (Course course2 : courses) {
//			System.out.println(course2.getCourseName() + " " + instructor.getLecturerFirstName() + " "
//					+ instructor.getLecturerLastName());
//		}
	}

//	public CourseManager(Course[] course, Instructor instructor) {
//		this();
//		for (Course course2 : course) {
//			System.out.println(course2.getCourseName() + " " + instructor.getLecturerFirstName() + " "
//					+ instructor.getLecturerLastName());
//		}
//	}

	public void enrollCourse(Course course, Student student) {
		this.user = student;
		System.out.println(course.getCourseName() + " isimli kursa ba�ar�yla kay�t oldunuz. "
				+ student.getStudentFirstName() + " " + student.getStudentLastName());
		System.out.println("�lerleme Durumu: " + course.getProgressionState());
	}

	public void disEnrollmentCourse(Course course, Student student) {
		this.user = student;
		System.out.println(course.getCourseName() + " isimli kurstan kayd�n�z iste�iniz �zerine silinmi�tir. "
				+ student.getStudentFirstName() + " " + student.getStudentLastName());
	}

	public Course[] getAllCourseList() {
		return this.courses;
	}
}
