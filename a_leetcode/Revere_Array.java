package a_leetcode;

import java.util.Scanner;

public class Revere_Array {
	public static void reverseArray(long[] arr, int start, int end) {
		while (start < end) {
			long a = arr[start];
			arr[start] = arr[end];
			arr[end] = a;
			start++;
			end--;
		}
	}

	public static void printArray(long[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];

        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        reverseArray(arr, 0, n - 1);
        printArray(arr,n);
	}
}
