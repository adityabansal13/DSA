package lec23;

public class Person {
	//private String name = "Kaju";
	//private int age = 20;
	String name ;
	int age;
	
//	public Person() {
//		
//	}
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
		if(age<0) {
			System.out.println("Error");
		}
		this.age = age;
	}

//	public Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	public Person(String name) {
//		
//	}
	
}
