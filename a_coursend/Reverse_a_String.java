package a_coursend;

public class Reverse_a_String {

	public static void main(String[] args) {
		String s = "Hello";
		String rev = "";
		for(int i=s.length()-1;i>=0;i--) {
			rev += s.charAt(i);
		}
		System.out.println(rev);

	}

}
