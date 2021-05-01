package kodlamaio_java_day3_2;

public class Student extends User {
	String[] coursesTaken;
	int percent;

	public Student() {

	}

	public Student(int id, String firstName, String lastName, String email, String[] coursesTaken, int percent) {
		super();
		this.coursesTaken = coursesTaken;
		this.percent = percent;
	}

	public String[] getCoursesTaken() {
		return coursesTaken;
	}

	public void setCoursesTaken(String[] coursesTaken) {
		this.coursesTaken = coursesTaken;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}
}
