package a_coursend;

import java.util.Stack;

public class Construct_Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		String pattern = "IIIDIDDD";
		System.out.println(Smallest_Construct(pattern));
	}

	public static String Smallest_Construct(String pattern) {
		int n = pattern.length();
		int[] arr = new int[n + 1];
		Stack<Integer> st = new Stack<>();
		int count = 1;
		for (int i = 0; i <= n; i++) {
			if (i == n || pattern.charAt(i) == 'I') {
				arr[i] = count;
				count++;
				while (!st.isEmpty()) {
					arr[st.pop()] = count;
					count++;
				}
			} else {
				st.push(i);
			}
		}
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			str += arr[i];
		}
		return str;
	}

}
