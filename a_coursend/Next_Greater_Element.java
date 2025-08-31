package a_coursend;

import java.util.Stack;

public class Next_Greater_Element {

	public static void main(String[] args) {
		int[] arr = { -5, 11, 9, 7, 13, 3 };

		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				arr[st.pop()] = arr[i];
			}
			st.push(i);
		}
		while (!st.isEmpty()) {
			arr[st.pop()] = -1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
