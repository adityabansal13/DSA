package a_coursendInheritance;

public class Student {
	String name = "Kaju";
	int age = 56;

	@Override
	public String toString() {
		//Overridden toString method of Object class
		return name + " " + age;
	}
}
