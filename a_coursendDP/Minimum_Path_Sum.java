package a_coursendDP;

import java.util.Arrays;

public class Minimum_Path_Sum {

	public static void main(String[] args) {

		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };

		int[][] dp = new int[grid.length][grid[0].length];

		for (int[] a : dp) {

			Arrays.fill(a, -1);

		}

		System.out.println(path_sum(grid, 0, 0, dp));

	}

	public static int path_sum(int[][] arr, int r, int c, int[][] dp) {

		if (r == arr.length - 1 && c == arr[0].length - 1) {

			return arr[r][c];

		}

		if (r == arr.length || c == arr[0].length) {

			return Integer.MAX_VALUE;

		}

		if (dp[r][c] != -1) {

			return dp[r][c];

		}

		int right = path_sum(arr, r, c + 1, dp);

		int down = path_sum(arr, r + 1, c, dp);

		return dp[r][c] = Math.min(right, down) + arr[r][c];

	}

}
