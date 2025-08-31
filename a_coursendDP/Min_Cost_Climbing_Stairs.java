package a_coursendDP;

import java.util.Arrays;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };

		int[] dp = new int[arr.length];

		Arrays.fill(dp, -1);

		int zeroth = Climbing_Stairs(arr, 0, dp);

		int first = Climbing_Stairs(arr, 1, dp);

		System.out.println(Math.min(zeroth, first));

	}

	public static int Climbing_Stairs(int[] arr, int i, int[] dp) {

		if (i >= arr.length) {

			return 0;

		}

		if (dp[i] != -1) {

			return dp[i];

		}

		int f = Climbing_Stairs(arr, i + 1, dp);

		int s = Climbing_Stairs(arr, i + 2, dp);

		return dp[i] = Math.min(f, s) + arr[i];

	}

}
