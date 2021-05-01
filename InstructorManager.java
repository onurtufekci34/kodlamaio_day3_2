package kodlamaio_java_day3_2;

public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("egitmen eklendi " + user.getFirstName());
	}

	@Override
	public void update(User user) {
		System.out.println("egitmen güncellendi");
	}

	@Override
	public void delete(User user) {
		System.out.println("egitmen silindi");
	}

	public void listCoursesGiven(User user) {

	}
}
