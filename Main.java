package kodlamaio_java_day3_2;

public class Main {

	public static void main(String[] args) {
		String[] courses = { "java", "c#" };

		Instructor engin = new Instructor(1, "Engin", "Demirog", "engin@gmail.com", courses);

		Student hary = new Student(1, "Hary", "Potter", "harypotter@gmail.com", courses, 70);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(engin);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(hary);
		
	}

}
