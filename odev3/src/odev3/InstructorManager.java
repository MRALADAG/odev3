package odev3;

public class InstructorManager extends UserManager {

	private Instructor instructor;
	private Course[] courses;
	private Course[] items;
	private Course item;
	private CourseManager courseManager;

	public InstructorManager(Instructor instructor) {
		this.instructor = instructor;
		this.courseManager = new CourseManager(instructor);
		this.courses = courseManager.getAllCourseList();
	}

	public void addCourse(Course course) {
		this.item = course;
		Course[] tempArray = courses;
		items = new Course[courses.length + 1];
		for (int i = 0; i < tempArray.length; i++) {
			items[i] = tempArray[i];
		}
		items[items.length - 1] = course;

		System.out.println("Eğitmen " + instructor.getUserFirstName() + " " + instructor.getUserLastName() + " "
				+ course.getCourseName() + " kursunu ekledi.");
//		System.out.println("****************************************");
//		for (Course course2 : items) {
//			System.out.println(course2.getCourseName());
//		}
	}

	public void deleteCourse(Course course) {
		System.out.println("Eğitmen " + instructor.getUserFirstName() + " " + instructor.getUserLastName() + " "
				+ course.getCourseName() + "isimli kursu başarıyla sistemden kaldırdınız.");
	}

	public Course[] getAllLecturerCourse() {
		return items;
	}
}
