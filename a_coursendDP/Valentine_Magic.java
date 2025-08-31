package a_coursendDP;

import java.util.Arrays;

// Codeskiller 281
public class Valentine_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] boys = { 2, 11, 3 };
//		int[] girls = { 5, 7, 3, 2 };
		int[] boys = { 4,5 };
		int[] girls = { 1,2,3,4,5 };
		Arrays.sort(boys);
		Arrays.sort(girls);
		System.out.println(valentine(boys, girls, 0, 0));
	}

	public static int valentine(int[] boys, int[] girls, int i, int j) {
		if (i == boys.length) {
			return 0;
		}
		if (j == girls.length) {
			return 1000000;
		}
		int pair = Math.abs(boys[i] - girls[j]) + valentine(boys, girls, i + 1, j + 1);
		int no_pair = valentine(boys, girls, i, j + 1);
		return Math.min(pair, no_pair);
	}

}
