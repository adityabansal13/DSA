package Assignment7;

import java.util.*;

public class Form_minimum_number_from_given_Sequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		for (int i = 0; i < arr.length; i++) {
			number(arr[i]);
			System.out.println();
		}
	}
	
	public static void number(String str) {
		int n = str.length();
		int[] ans = new int[n+1];
		Stack<Integer> st = new Stack<>();
		int count=1;
		for (int i = 0; i <= n; i++) {
			if(i==n || str.charAt(i)=='I') {
				ans[i] = count;
				count++;
				while(!st.isEmpty()) {
					ans[st.pop()] = count;
					count++;
				}
			}
			else {
				st.push(i);
			}
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]);
		}
	}

}
