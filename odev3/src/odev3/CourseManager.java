package odev3;

public class CourseManager {

	private Course[] courses;
	private User user;
//	private Course course1;
//	private Course course2;

	public CourseManager() {
//		this.course1 = new Course(1, "Yaz?l?m Geli?tirici Yeti?tirme Kamp? (C# + ANGULAR)", 89);
//		this.course2 = new Course(2, "Programlamaya Giri? i?in Temel Kurs", 100);
//		this.courses = new Course[] { course1, course2 };
		this.courses = new Course[] { new Course(1, "Yaz?l?m Geli?tirici Yeti?tirme Kamp? (C# + ANGULAR)", 89),
				new Course(2, "Programlamaya Giri? i?in Temel Kurs", 100) };

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
		System.out.println(course.getCourseName() + " isimli kursa ba?ar?yla kay?t oldunuz. "
				+ student.getUserFirstName() + " " + student.getUserLastName());
		System.out.println("?lerleme Durumu: " + course.getProgressionState());
	}

	public void disEnrollmentCourse(Course course, Student student) {
		this.user = student;
		System.out.println(course.getCourseName() + " isimli kurstan kayd?n?z iste?iniz ?zerine silinmi?tir. "
				+ student.getUserFirstName() + " " + student.getUserLastName());
	}

	public Course[] getAllCourseList() {
		return this.courses;
	}
}
