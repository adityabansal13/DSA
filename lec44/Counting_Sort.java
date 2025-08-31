package lec44;

import java.util.Arrays;

public class Counting_Sort {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 1, 0, 1, 2, 5, 4, 0, 2, 8, 7, 9, 2, 6, 1, 9 };
		Sort(arr);
	}

	public static int[] Sort(int[] arr) {
		int key = Arrays.stream(arr).max().getAsInt();
		int[] freq = new int[key + 1];
		for (int i = 0; i < freq.length; i++) {
			freq[arr[i]]++; // freq[arr[i]] = freq[arr[i]]+1;

		}
		for (int i = 0; i < freq.length; i++) {
			freq[arr[i]] = freq[arr[i - 1]] + freq[arr[i]];
		}
		int[] ans = new int[arr.length];
		for (int i = arr.length; i >= 0; i++) {
			int x = arr[i];
			int c = freq[x];
			ans[c - 1] = x;
			freq[x]--;
		}
		return ans;
	}

}
