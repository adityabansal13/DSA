package a_coursendDP;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_II {

	public static void main(String[] args) {

		int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int ans = Integer.MAX_VALUE;
		int[][] dp = new int[matrix.length][matrix[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -1000000);
		}
		for (int i = 0; i < matrix.length; i++) {
			ans = Math.min(ans, falling_sum(matrix, 0, i, dp));
		}
		System.out.println(ans);
	}

	public static int falling_sum(int[][] grid, int cr, int cc, int[][] dp) {
		if (cr == grid.length - 1) {
			return grid[cr][cc];
		}
		if (dp[cr][cc] != -1000000) {
			return dp[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < dp[0].length; i++) {
			if (cc != i) {
				ans = Math.min(ans, falling_sum(grid, cr + 1, i, dp));
			}
		}
		return dp[cr][cc] = ans + grid[cr][cc];
	}

}
