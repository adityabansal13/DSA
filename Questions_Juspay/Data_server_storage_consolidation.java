package Questions_Juspay;

import java.util.*;

public class Data_server_storage_consolidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solve(arr));
	}

	public static int solve(int[] arr) {
		int n = arr.length;
		Arrays.sort(arr);
		int maxInwindow = 0;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			while (j < n && arr[j] - arr[i] < n) {
				j++;
			}
			maxInwindow = Math.max(maxInwindow, j - i);
		}
		return n - maxInwindow;
	}

}
