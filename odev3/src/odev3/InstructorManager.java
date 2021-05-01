package odev3;

public class InstructorManager extends UserManager {

	Instructor instructor;
	Course[] courses;
	Course[] items;
	Course item;

	public InstructorManager() {
		item = new Course();
		items = new Course[] { item };
	}

	public void addCourse(Course course) {

		Course[] tempArray = items;
		items = new Course[items.length + 1];
		for (int i = 0; i < tempArray.length; i++) {
			items[i] = tempArray[i];
		}
		items[items.length - 1] = course;

		System.out.println("Eğitmen " + instructor.getLecturerFirstName() + " " + instructor.getLecturerLastName()
				+ course.getCourseName() + "kursunu ekledi.");
	}

	public void deleteCourse(Course course) {
		System.out.println("Eğitmen " + instructor.getLecturerFirstName() + " " + instructor.getLecturerLastName()
				+ course.getCourseName() + "isimli kursu başarıyla sistemden kaldırdınız.");
	}
}
