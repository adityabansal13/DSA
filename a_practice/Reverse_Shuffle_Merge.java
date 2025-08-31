package a_practice;

import java.util.Arrays;

public class Reverse_Shuffle_Merge {

	public static void main(String[] args) {
		System.out.println(reverse("abc"));
	}

	public static String reverse(String s) {
		System.out.println(s);
		s = s.trim(); // aage aur peeche ke extra spaces hata dega
		System.out.println(s);
		String[] arr = s.split(" +"); // redux
		System.out.println(Arrays.toString(arr));

		String ans = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			ans = ans + arr[i] + " ";
		}
		return ans.trim();
	}

}
