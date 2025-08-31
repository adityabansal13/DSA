package lec24;

public class Person {
	String name = "Kaju";
	int age = 20;

//	public Person() {
//		
//	}
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		try {
			if (age < 0) {
				throw new Exception("Bklol age -ve nhi hoga");
			}
			this.age = age;
		}
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace(); //prints the line number where error is thrown
		}
		finally {
			System.out.println("I am finally block");
		}
	}
	
//	public void setAge(int age) throws Exception {
//		if (age < 0) {
//			throw new Exception("Bklol age -ve nhi hoga");
//		}
//		this.age = age;
//	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
//	public Person(String name) {
//		
//	}
}