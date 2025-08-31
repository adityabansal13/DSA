package lec23;

public class Student {
	String name;
	int age;

	public void Intro_yourself() {
		System.out.println("My name is " + name + " and age is " + age);
	}

	public void Sayhey(String name) {
		System.out.println(this.name + " SayHey " + name);
	}
	
	public static void MentorName() {
		System.out.println("monu bhaiya");
	}
	
	static {
		System.out.println("Welcome to Student Class");
	}
}
