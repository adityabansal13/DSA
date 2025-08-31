package lec47;

public class Wine {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 1, 4 };
		System.out.println(maximum_profit(arr, 0, arr.length - 1, 1));
		System.out.println(maximumBU(arr));
	}

	public static int maximum_profit(int[] arr, int i, int j, int year) {
		if (i > j) {
			return 0;
		}
		int first = arr[i] * year + maximum_profit(arr, i + 1, j, year + 1);
		int last = arr[j] * year + maximum_profit(arr, i, j - 1, year + 1);
		return Math.max(first, last);
	}

	public static int maximumBU(int[] arr) {
		int[][] dp = new int[arr.length][arr.length];
		int year = arr.length;
		for (int i = 0; i < dp.length; i++) {
			dp[i][i] = arr[i] * year;
		}
		year--;
		for (int gap = 1; gap < dp.length; gap++) {
			for (int j = gap; j < dp.length; j++) {
				int i = j - gap;
				int first = arr[i] * year + dp[i + 1][j];
				int last = arr[j] * year + dp[i][j - 1];
				dp[i][j] = Math.max(first, last);
			}
			year--;
		}
		return dp[0][dp[0].length-1];
	}

}
