package a_coursendSlidingWindow;

import java.util.Scanner;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String str = "aabababbabaaaaaaabbaa";
		int k = 3;
		int flipa = maxlen(str, k, 'a');
		int flipb = maxlen(str, k, 'b');
		System.out.println(Math.max(flipa, flipb));
	}

	public static int maxlen(String str, int k, char ch) {
		int si = 0;
		int ei = 0;
		int ans = 0;
		int flip = 0;
		while (ei < str.length()) {
			// growing
			if (str.charAt(ei) == ch) {
				flip++;
			}
			// shrinking
			while (flip > k) {
				if (str.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			// calculating ans
			ans = Math.max(ans, (ei - si + 1));
			ei++;
		}
		return ans;
	}

}
