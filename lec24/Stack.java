package lec24;

public class Stack {
	protected int[] arr;
	private int idx = -1;

	public Stack(int n) {
		arr = new int[n];
	}

	public Stack() {
		arr = new int[5];
	}

	public boolean isEmpty() {
		return idx == -1; // will return true of false
	}

	public boolean isFull() {
		return size() == arr.length; // will return true of false
	}

	public void push(int item) throws Exception{
		if(isFull()) {
			throw new Exception("Bklol Stack full hai");
		}
		idx++;
		arr[idx] = item;
	}

	public int size() {
		return idx + 1;
	}

	public int peek() throws Exception{
		if(isEmpty()) {
			throw new Exception("Bklol Stack empty hai");
		}
		return arr[idx];
	}

	public int pop() {
		int v = arr[idx];
		idx--;
		return v;
	}

	public void Display() {
		for (int i = 0; i <= idx; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
