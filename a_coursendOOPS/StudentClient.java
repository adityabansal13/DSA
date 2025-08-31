package a_coursendOOPS;

public class StudentClient {

	public static void main(String[] args) {
		Student s = new Student("raj", 29);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		s.setName("Kunal");
		s.setAge(21);
		s.Intro_yourself();

	}

}
