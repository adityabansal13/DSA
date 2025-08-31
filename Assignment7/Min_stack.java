package Assignment7;

import java.util.*;

public class Min_stack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		Stack<Integer> st = new Stack<>();
		Stack<Integer> min = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("push")) {
				int x = sc.nextInt();
				st.push(x);
				if(min.isEmpty() || x<=min.peek()) {
					min.push(x);
				}
				
			} else if (arr[i].equals("pop")) {
				if(st.peek()==min.peek()) {
					min.pop();
				}
				st.pop();
			} else if (arr[i].equals("top")) {
				System.out.print(st.peek() + " ");
			} else if (arr[i].equals("getMin")) {
				System.out.print(min.peek() + " ");
			}
		}
	}

}
