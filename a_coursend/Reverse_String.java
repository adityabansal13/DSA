package a_coursend;

public class Reverse_String {

	public static void main(String[] args) {
		String[] s = {"h","e","l","l","o"};
		int i=0;
		int j=s.length-1;
		while(i<j) {
			String temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}
		for (int j2 = 0; j2 < s.length; j2++) {
			System.out.print(s[j2] + " ");
		}

	}

}
