package Assignment7;

import java.util.*;

public class Playing_with_Cards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < n; i++) {
			st.push(sc.nextInt());
		}
//		for (int i = 0; i < n; i++) {
//			System.out.println(st.pop());
//		}
		List<Integer> ll = prime(q);
//		System.out.println(ll);
		Stack<Integer> A = new Stack<>();
		Stack<Integer> B = new Stack<>();
		int i = 0;
		while (i < q) {
			int pr = ll.get(i);
//			System.out.println(pr);
			while (!st.isEmpty()) {
				int p = st.pop();
				if (p % pr == 0) {
					B.add(p);
				} else {
					A.add(p);
				}
			}
			i++;
		}
		while (!B.isEmpty()) {
			System.out.println(B.pop());
		}
		while (!A.isEmpty()) {
			System.out.println(A.pop());
		}

	}

	public static List<Integer> prime(int n) {
		int count = 0;
		int x = 2;
		List<Integer> ll = new ArrayList<>();
		while (count < n) {
			int i = 2;
			for (; i < x; i++) {
				if (x % i == 0) {
					break;
				}
			}
			if (i == x) {
				// System.out.println(i);
				ll.add(i);
				count++;
			}
			x++;
		}
		return ll;
	}

}
