package a_coursendDP;

public class Knapsack_zero_one {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int[] wt = { 1, 2, 3, 2, 2 };

		int[] val = { 8, 4, 0, 5, 3 };

	}

	public static int knapsack(int[] wt, int[] val, int cap, int idx) {

		if (cap == 0 || idx == wt.length) {

			return 0;

		}

		int inc = 0, exc = 0;

		if (cap >= wt[idx]) {

			inc = val[idx] + knapsack(wt, val, cap - val[idx], idx + 1);

		}

		exc = knapsack(wt, val, cap, idx + 1);

		return Math.max(inc, exc);

	}

}