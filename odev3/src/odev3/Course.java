package odev3;

public class Course {
	private int courseId;
	private String courseName;
	private int progressionState = 0;

	private Course course1;
	private Course course2;
	private Course[] courses;

	public Course() {

	}

	public Course(int courseId, String courseName, int progressionState) {
		this();
		this.courseId = courseId;
		this.courseName = courseName;
		this.progressionState = progressionState;
	}

//	public Course() {
//		this.course1 = new Course();
//		this.course1.setCourseId(1);
//		this.course1.setCourseName("Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)");
//		this.course1.progressionState = 89;
//
//		this.course2 = new Course();
//		this.course2.setCourseId(2);
//		this.course2.setCourseName("Programlamaya Giriþ için Temel Kurs");
//		this.course2.progressionState = 100;
//
//		this.courses = new Course[] { course1, course2 };
//	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getProgressionState() {
		return progressionState;
	}
}
