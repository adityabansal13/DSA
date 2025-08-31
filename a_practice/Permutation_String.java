package a_practice;

public class Permutation_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		Perm(ques, "");
	}

	public static void Perm(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String prev = ques.substring(0, i);
			String next = ques.substring(i + 1);
			Perm(prev + next, ans + ch);
		}
	}

}
