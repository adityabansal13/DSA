package Assignment7;

import java.util.*;

public class Next_Greater_Element_CircularArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] ans = max(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	public static int[] max(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[arr.length];
		Arrays.fill(ans, -1);
		for (int i = 0; i < 2 * arr.length; i++) {
			int idx = i % arr.length;
			while (!st.isEmpty() && arr[idx] > arr[st.peek()]) {
				ans[st.pop()] = arr[idx];
			}
			if(i<arr.length) {
				st.push(idx);
			}
		}
		return ans;
	}

}
