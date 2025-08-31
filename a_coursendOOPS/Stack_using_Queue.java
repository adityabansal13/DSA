package a_coursendOOPS;

public class Stack_using_Queue {

	private Dynamic_Queue Q;

	// Constructor call
	public Stack_using_Queue() {
		Q = new Dynamic_Queue();
	}

	public int size() {
		return Q.size();
	}

//	public boolean Isfull() {
//		return Q.isfull();
//	}

	public boolean IsEmpty() {
		return Q.isEmpty();
	}

	// O(1)
	public void push(int item) throws Exception {
		Q.Enqueue(item);
	}

	// O(N)
	public int pop() throws Exception {
		Dynamic_Queue hlpQ = new Dynamic_Queue();
		while (Q.size() > 1) {
			hlpQ.Enqueue(Q.Dequeue());
		}
		int rv = Q.Dequeue();
		while (hlpQ.size() > 0) {
			Q.Enqueue(hlpQ.Dequeue());
		}
		return rv;
	}

	public int peek() throws Exception {
		Dynamic_Queue hlpQ = new Dynamic_Queue();
		while (Q.size() > 1) {
			hlpQ.Enqueue(Q.Dequeue());
		}
		int rv = Q.Dequeue();
		hlpQ.Enqueue(rv);
		while (hlpQ.size() > 0) {
			Q.Enqueue(hlpQ.Dequeue());
		}
		return rv;
	}

	public static void main(String[] args) throws Exception {
		Stack_using_Queue st = new Stack_using_Queue();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		System.out.println(st.pop());
		System.out.println(st.peek());
	}

}
