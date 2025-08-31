package a_coursendLinkedList;

public class LinkedList {

	class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void AddFirst(int item) {
		Node nn = new Node();
		nn.data = item;
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

	// O(1)
	public void AddLast(int item) {
		if (size == 0) {
			AddFirst(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	// O(N)
	public void AddAtIndex(int item, int k) {
		if (size == 0) {
			AddFirst(item);
		} else if (size == k) {
			AddLast(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			Node k_1th = GetNode(k - 1);
			nn.next = k_1th.next;
			k_1th.next = nn;
			size++;
		}
	}

	// O(1)
	public int getfirst() {
		return head.data;
	}

	// O(1)
	public int getlast() {
		return tail.data;
	}

	// O(N)
	public int getindex(int k) {
		return GetNode(k).data;
	}

	// O(1)
	public int removefirst() {
		int rv = head.data;
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			Node temp = head;
			head = head.next;
			temp.next = null;
		}
		size--;
		return rv;
	}

	// O(N)
	public int removelast() {
		if (size == 1) {
			return removefirst();
		} else {
			int rv = tail.data;
			Node sl = GetNode(size - 2);
			sl.next = null;
			tail = sl;
			size--;
			return rv;
		}
	}

	// O(N)
	public int removeindex(int k) {
		if (k == 0) {
			return removefirst();
		} else if (k == size - 1) {
			return removelast();
		} else {
			Node prev = GetNode(k - 1);
			Node curr = prev.next;
			int rv = curr.data;
			prev.next = curr.next;
			curr.next = null;
			return rv;
		}
	}

	public int size() {
		return size;
	}

	// O(N)
	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(". ");
	}

	// ye hum humare internal usage ke liye banare hai
	// O(N)
	private Node GetNode(int k) {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

}
