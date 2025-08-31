package Assignment9;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Find_kth_Largest_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();		

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		PriorityQueue<Integer> hp = new PriorityQueue<>();

		for (int i = 0; i < k; i++) {
			hp.add(arr[i]);
		}

		for (int i = k; i < arr.length; i++) {
			if (hp.peek() < arr[i]) {
				hp.poll();
				hp.add(arr[i]);
			}
		}

		System.out.println(hp.peek());

	}

}
