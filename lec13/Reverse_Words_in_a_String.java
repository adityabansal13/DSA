package lec13;

import java.util.Arrays;

public class Reverse_Words_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "    a good        example  ";
		System.out.println(s);
		s = s.trim(); // aage aur peeche ke extra spaces hata dega
		System.out.println(s);
		String[] arr = s.split(" +"); // redux
		System.out.println(Arrays.toString(arr));
		
		String ans = "";
		for(int i = arr.length-1;i>=0;i--) {
			ans = ans + arr[i] + " ";
		}
		System.out.println(ans.trim());
	}

}
