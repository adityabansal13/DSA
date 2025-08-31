package a_coursendOOPS;

public class Student {

	private String name = "ash";
	private int age = 19;

	public Student(String name, int age) { // constructor
		this.age = age;
		this.name = name; 
	}

	public void Intro_yourself() {
		System.out.println("My name is " + name + " and age is " + age);
		System.out.println("My name is " + this.name + " and age is " + this.age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			return;
		}
		this.age = age;
	}

}
