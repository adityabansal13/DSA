package lec13;

public class String_Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello"; //inside pool
		String s2 = "Hello";
		String s3 = new String("Hello"); //outside pool
		String s4 = new String("Hello"); //outside pool
//		System.out.println(s1 + "be");
		s1 = s1 + "bye";
		s1 = s1 + s3;
		s1 = s1.concat(s3); //outside pool
		String s5 = "hey" + "bye";  //inside pool
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s5);
		System.out.println(s5.charAt(2));
	}

}
