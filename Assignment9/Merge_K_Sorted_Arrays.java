package Assignment9;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Merge_K_Sorted_Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();

		int[] res = new int[k * n];

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < res.length; i++) {
			pq.add(sc.nextInt());
		}
		for (int i = 0; i < res.length; i++) {
			res[i] = pq.poll();
		}
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}

//		for (int i = 0; i < k; i++) {
////			int[] arr = new int[n];
//			for (int j = 0; j < n; j++) {
////				arr[j] = sc.nextInt();
//				pq.add(sc.nextInt());
//			}
////			ll.add(arr);
//			
//		}

//		System.out.println(ll.get(0)[0]);
	}

}
