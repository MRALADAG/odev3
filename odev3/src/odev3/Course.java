package odev3;

public class Course {
	private int courseId;
	private String courseName;
	private int progressionState = 0;

	public Course() {
		Course course1 = new Course();
		course1.setCourseId(1);
		course1.setCourseName("Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)");
		course1.progressionState = 89;

		Course course2 = new Course();
		course2.setCourseId(2);
		course2.setCourseName("Programlamaya Giriþ için Temel Kurs");
		course2.progressionState = 100;

		Course[] courses = { course1, course2 };
	}

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
