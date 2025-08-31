package Assignment7;

import java.util.*;

public class Dequeue_efficient_queue_using_stack {

	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();

	public void enqueue(int x) {
		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		s1.push(x);
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
	}

	public int dequeue() {
		if (s2.isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return s2.pop();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Dequeue_efficient_queue_using_stack q = new Dequeue_efficient_queue_using_stack();
		for (int i = 0; i < n; i++) {
			q.enqueue(i);
		}
		for (int i = 0; i < n; i++) {
			System.out.print(q.dequeue() + " ");
		}
	}

}
