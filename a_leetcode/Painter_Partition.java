package a_leetcode;

import java.util.Scanner;

public class Painter_Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		long[] arr = new long[n];
		long sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
			sum += arr[i];
		}
		long s = 0;
		long e = sum;
		long ans = 0;
		while (s <= e) {
			long mid = (s + e) / 2;
			if (isPossible(arr, mid, k)) {
				e = mid - 1;
				ans = mid;
			} else {
				s = mid + 1;
			}
		}
		System.out.println(ans);
	}

	public static boolean isPossible(long[] arr, long mid, int k) {
		int c = 0;
		long sum = 0;
		for (int i = 0; i < arr.length;) {
			if (sum + arr[i] <= mid) {
				sum += arr[i];
				i++;
			} else {
				c++;
				sum = 0;
			}
			if (c > k) {
				return false;
			}
			// if(sum+arr[i] > mid){
			// c++;
			// sum = 0;
			// if(c>k){
			// return false;
			// }
			// }
			// sum += arr[i];

		}
		return true;
	}

}
