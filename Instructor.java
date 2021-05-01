package kodlamaio_java_day3_2;

public class Instructor extends User {
	String[] coursesGiven;

	public Instructor() {

	}

	public Instructor(int id, String firstName, String lastName, String email, String[] coursesGiven) {
		super();
		this.coursesGiven = coursesGiven;
	}

	public String[] getCoursesGiven() {
		return coursesGiven;
	}

	public void setCoursesGiven(String[] coursesGiven) {
		this.coursesGiven = coursesGiven;
	}
}
