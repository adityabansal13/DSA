package a_coursendDP;

import java.util.Arrays;

public class Coin_Change_II {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int[] coins = { 1, 2, 5 };

		int amount = 5;

		System.out.println(coinchange(coins, amount, 0));

		int[][] dp = new int[amount + 1][coins.length];

		for (int[] a : dp) {

			Arrays.fill(a, -1);

		}

		System.out.println(coinchangeTD(coins, amount, 0, dp));

	}

	// recursion

	public static int coinchange(int[] coins, int amount, int idx) {

		if (amount == 0) {

			return 1;

		}

		if (idx == coins.length) {

			return 0;

		}

		int inc = 0, exc = 0;

		if (coins[idx] <= amount) {

			inc = coinchange(coins, amount - coins[idx], idx);

		}

		exc = coinchange(coins, amount, idx + 1);

		return exc + inc;

	}

	// dp

	public static int coinchangeTD(int[] coins, int amount, int idx, int[][] dp) {

		if (amount == 0) {

			return 1;

		}

		if (idx == coins.length) {

			return 0;

		}

		if (dp[amount][idx] != -1) {

			return dp[amount][idx];

		}

		int inc = 0, exc = 0;

		if (coins[idx] <= amount) {

			inc = coinchangeTD(coins, amount - coins[idx], idx, dp);

		}

		exc = coinchangeTD(coins, amount, idx + 1, dp);

		return dp[amount][idx] = exc + inc;

	}

	public static int coinchangeBU(int[] coins, int amount) {

		int[][] dp = new int[amount + 1][coins.length + 1];

		for (int i = 0; i < dp[0].length; i++) {

			dp[0][i] = 1;

		}

		for (int am = 1; am < dp.length; am++) { // amount

			for (int i = 1; i < dp[0].length; i++) { // coin

				int inc = 0, exc = 0;

				if (coins[i - 1] <= am) {

					inc = dp[am - coins[i - 1]][i];

				}

				exc = dp[am][i - 1];

				dp[am][i] = exc + inc;

			}

		}

		return dp[dp.length - 1][dp[0].length - 1];

	}

}
