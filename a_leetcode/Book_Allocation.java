package a_leetcode;

import java.util.Scanner;

public class Book_Allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] page = new int[n];
			for (int i = 0; i < n; i++) {
				page[i] = sc.nextInt();
			}
			System.out.println(MinPages(page, m));

		}
	}

	public static int MinPages(int[] page, int m) {
		int lo = 0;
		int hi = 0;
		for (int i = 0; i < page.length; i++) {
			hi += page[i];
		}
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitPossible(page, m, mid) == true) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}

	public static boolean isitPossible(int[] page, int m, int mid) {
		int student = 1;
		int readpage = 0;
		for (int i = 0; i < page.length;) {
			if (readpage + page[i] <= mid) {
				readpage += page[i];
				i++;
			} else {
				student++;
				readpage = 0;
			}
			if (student > m)
				return false;
		}
		return true;
	}

}
