package Assignment9;

import java.util.*;

public class Merge_K_Sorted_Lists {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();

//		List<LinkedList<Integer>> lists = new ArrayList<>();
		Node[] arr = new Node[k];
		PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);

		for (int i = 0; i < k; i++) {
			Node head = null, tail = null;
			for (int j = 0; j < n; j++) {
				int val = sc.nextInt();
				Node newNode = new Node(val);
				if (head == null) {
					head = newNode;
					tail = newNode;
				} else {
					tail.next = newNode;
					tail = tail.next;
				}
			}
			arr[i] = head;
			pq.add(arr[i]);
		}

		LinkedList<Node> ll = new LinkedList<>();
		while (!pq.isEmpty()) {
			Node rv = pq.poll();
			if (rv.next != null) {
				pq.add(rv.next);
			}
			ll.add(rv);
		}

		for (int i = 0; i < n * k; i++) {
			System.out.print(ll.get(i).data + " ");
		}

		
	}

}
