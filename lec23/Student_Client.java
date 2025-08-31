package lec23;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer> ll = new ArrayList<>();
		System.out.println("Hello");
		Student s1 = new Student();
		s1.name = "Kaju";
		s1.age = 21;
		s1.Intro_yourself();
		Student s2 = new Student();
		s2.name = "Raju";
		s2.age = 20;
		s2.Intro_yourself();
		s1.Sayhey(s2.name);
		
		s1.MentorName();
		Student.MentorName();
	}
	
	static {
		System.out.println("Welcome to Student Client Class");
	}

}
