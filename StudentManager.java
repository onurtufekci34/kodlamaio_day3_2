package kodlamaio_java_day3_2;

public class StudentManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println("�grenci eklendi " + user.getFirstName());
	}

	@Override
	public void update(User user) {
		System.out.println("�grenci guncellendi");
	}

	@Override
	public void delete(User user) {
		System.out.println("�grenci silindi");
	}
	
	public void listCoursesTaken(User user) {
		
	}
}
