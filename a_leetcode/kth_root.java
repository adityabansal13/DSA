package a_leetcode;

import java.util.Scanner;

public class kth_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			long n = sc.nextLong();
			long k = sc.nextLong();
			long s = 1;
			long e = n;
			long mid = (s + e) / 2;
			long ans = 0;
			while (s <= e) {
				if (Math.pow(mid, k) <= n) {
					ans = mid;
					s = mid + 1;
				} else {
					e = mid - 1;
				}
				mid = (s + e) / 2;
			}
			System.out.println(ans);
		}
	}

}
