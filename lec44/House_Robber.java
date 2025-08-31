package lec44;

import java.util.Arrays;

public class House_Robber {

	public static void main(String[] args) {
		int[] arr = { 2, 7, 9, 3, 1 };
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
		//System.out.println(Robber1(arr, arr.length - 1, dp));
		System.out.println(RobberBU(arr));
	}

	public static int RobberBU(int[] arr) {
		if (arr.length == 1) {
			return arr[0];
		}
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		for (int i = 2; i < dp.length; i++) {
			int rob = arr[i] + dp[i-2];
			int dont_rob = dp[i-1];
			dp[i] = Math.max(rob, dont_rob);
		}
		return dp.length-1;
	}

	public static int Robber1(int[] arr, int i, int[] dp) {
		if (i < 0) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + Robber1(arr, i - 2, dp);
		int dont_rob = Robber1(arr, i - 1, dp);
		return Math.max(rob, dont_rob);
	}

//	public static int Robber(int[] arr, int i, int[] dp) {
//		if (i >= arr.length) {
//			return 0;
//		}
//		if (dp[i] != -1) {
//			return dp[i];
//		}
//		int rob = arr[i] + Robber(arr, i + 2, dp);
//		int dont_rob = Robber(arr, i + 1, dp);
//		return Math.max(rob, dont_rob);
//	}

}
