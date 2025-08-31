package lec28;

public class LinkedList {

	class Node {
		int val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	// 0(1)
	public void addFirst(int item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	// 0(1)
	public void addLast(int item) {
		if (size == 0) {
			addFirst(item);
		} else {
			Node nn = new Node();
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	// 0(1)
	public void addatIndex(int item, int k) {
		if (k == 0) {
			addFirst(item);
		} else if (k == size) {
			addLast(item);

		} else {
			Node nn = new Node();
			nn.val = item;
			Node prev = getNode(k - 1);
			nn.next = prev.next;
			prev.next = nn;
			size++;
		}
	}

	// 0(1)
	public int getfirst() {
		return head.val;
	}

	// 0(1)
	public int getlast() {
		return tail.val;
	}

	// 0(1)
	public int getatIndex(int k) {
		return getNode(k).val;
	}

	// 0(N)
	private Node getNode(int k) { //returns value at index k
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	// 0(N)
	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	// 0(1)
	public int removeFirst() {
		int v = head.val;
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			Node n = head;
			head = head.next;
			n.next = null;
			size--;
		}
		return v;
	}

	// 0(1)
	public int removeLast() {
		if (size == 1) {
			return removeFirst();
		} else {
			Node prev = getNode(size - 2);
			int v = tail.val;
			tail = prev;
			tail.next = null;
			size--;
			return v;
		}
	}

	// 0(1)
	public int removeatIndex(int k) {
		if (k == 0) {
			return removeFirst();
		} else if (k == size - 1) {
			return removeLast();
		} else {
			Node prev = getNode(k - 1);
			Node curr = getNode(k);
			prev.next = curr.next;
			size--;
			return curr.val;
		}
	}

}
