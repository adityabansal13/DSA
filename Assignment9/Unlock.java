package Assignment9;

import java.util.*;

public class Unlock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			pq.add(arr[i]);
		}

//		for (int i = 0; i < n; i++) {
//			System.out.println(pq.poll());
//		}

		for (int i = 0; i < arr.length; i++) {
			int a = pq.poll();
			int v = arr[i];
			if (arr[i] < a) {
				arr[i] = a;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == a) {
					arr[j] = v;
				}
			}
			if (k == 0) {
				break;
			}
			k--;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
