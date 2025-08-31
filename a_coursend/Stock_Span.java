package a_coursend;

import java.util.Stack;

public class Stock_Span {

	public static void main(String[] args) {
		// int[] arr = { 3, 1, 6, 4, 18, 7, 5, 11, 19 };
		int[] arr = { 30, 35, 40, 38, 35 };
		span(arr);
	}

	public static void span(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
				st.pop();
			}
			if (st.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - st.peek();
			}
			st.push(i);
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i] + "," + ans[i]);
		}
	}

}
