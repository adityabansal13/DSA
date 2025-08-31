package lec46;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_II {

	public static void main(String[] args) {
		int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int[][] dp = new int[matrix.length][matrix[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, 999999);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < matrix[0].length; i++) {
			ans = Math.min(ans, Minimum_Falling_Path(matrix, 0, i, dp));
		}
		System.out.println(ans);
	}

	public static int Minimum_Falling_Path(int[][] matrix, int cr, int cc, int[][] dp) {
		if (cc == matrix[0].length-1) {
			return matrix[cr][cc];
		}
		if (dp[cr][cc] != 999999) {
			return dp[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		for (int col = 0; col < matrix[0].length; col++) {
			if(col == cc) {
				continue;
			}
			ans = Math.min(ans, Minimum_Falling_Path(matrix, cr+1, col, dp));
			
		}
		return dp[cr][cc] = ans + matrix[cr][cc];
		
		
	}

}
