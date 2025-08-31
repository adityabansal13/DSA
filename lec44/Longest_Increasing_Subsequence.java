package lec44;

import java.util.Arrays;

public class Longest_Increasing_Subsequence {

	public static void main(String[] args) {
		int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 };

	}

	public static int lis(int[] arr) {
		int[] dp = new int[arr.length];
		Arrays.fill(dp, 1);
		for (int i = 1; i < arr.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] < arr[i]) {
					int x = dp[j];
					dp[i] = Math.max(x + 1, dp[i]);
				}

			}
		}
		return Arrays.stream(dp).max().getAsInt(); // returns max value from dp array
		// Arrays.stream --> data ko 1 by 1 read krna
		// getAsInt --> integer me return krra h
	}

}
