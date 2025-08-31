package a_coursendDP;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum {

	public static void main(String[] args) {

		int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };

		int ans = Integer.MAX_VALUE;

		int[][] dp = new int[matrix.length][matrix[0].length];

		for (int[] a : dp) {

			Arrays.fill(a, -1000000);

		}

		for (int i = 0; i < matrix[0].length; i++) {

			ans = Math.min(ans, falling_sum(matrix, 0, i, dp));

		}

		System.out.println(ans);

	}

	public static int falling_sum(int[][] grid, int cr, int cc, int[][] dp) {

		if (cc < 0 || cc >= grid[0].length) {

			return Integer.MAX_VALUE;

		}

		if (cr == grid.length - 1) {

			return grid[cr][cc];

		}

		if (dp[cr][cc] != -1000000) {

			return dp[cr][cc];

		}

		int ld = falling_sum(grid, cr + 1, cc - 1, dp);

		int rd = falling_sum(grid, cr + 1, cc + 1, dp);

		int down = falling_sum(grid, cr + 1, cc, dp);

		return dp[cr][cc] = Math.min(down, Math.min(rd, ld)) + grid[cr][cc];

	}

}
