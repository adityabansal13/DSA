package a_coursendOOPS;

import java.util.Stack;

public class Queue_using_Stack {

	private Stack<Integer> st;

	public Queue_using_Stack() {
		st = new Stack<>();
	}

	public int size() {
		return st.size();
	}

	public boolean IsEmpty() {
		return st.isEmpty();
	}

	// O(N)
	public void Enqueue(int item) {
		Stack<Integer> hlps = new Stack<>();
		while (!st.isEmpty()) {
			hlps.push(st.pop());
		}
		st.push(item);
		while (!hlps.isEmpty()) {
			st.push(hlps.pop());
		}
	}

	public int Dequeue() {
		return st.pop();
	}

	public int Getfront() {
		return st.peek();
	}

	public static void main(String[] args) {
		Queue_using_Stack q = new Queue_using_Stack();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		System.out.println(q.Dequeue());
		System.out.println(q.Getfront());
	}
}
