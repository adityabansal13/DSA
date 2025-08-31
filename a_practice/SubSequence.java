package a_practice;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		sub(s,"");
	}

	public static void sub(String s, String ans) {
		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = s.charAt(0);
		sub(s.substring(1), ans);
		sub(s.substring(1), ans + ch);
	}

}
