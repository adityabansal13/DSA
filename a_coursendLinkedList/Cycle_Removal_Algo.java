package a_coursendLinkedList;

import java.util.Iterator;

public class Cycle_Removal_Algo {

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

	public void CreateCycle() {
		Node nn = GetNode(2);
		tail.next = nn;
	}

	public Node hasCycle() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}

		return null;
	}

	// 0(n^2)
	public void CycleRemove1() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node start = head;
		while (start != null) {
			Node temp = meet;
			while (temp.next != meet) {
				if (temp.next == start) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			start = start.next;
		}
	}

	// 0(n)
	public void CycleRemove2() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		// Cycle ki length
		int count = 1;
		Node temp = meet;
		while (temp.next != meet) {
			count++;
			temp = temp.next;
		}
		// ek ko pehle m distance chalwado
		Node fast = head;
		for (int i = 0; i < count; i++) {
			fast = fast.next;
		}
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}
	
	public void floydCycleRemoval() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node fast = meet;
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}

	public static void main(String[] args) {
		Cycle_Removal_Algo cy = new Cycle_Removal_Algo();
		cy.AddLast(1);
		cy.AddLast(2);
		cy.AddLast(3);
		cy.AddLast(4);
		cy.AddLast(5);
		cy.AddLast(6);
		cy.AddLast(7);
		cy.AddLast(8);
		cy.CreateCycle();
		//cy.CycleRemove1();
		//cy.CycleRemove2();
		cy.floydCycleRemoval();
		cy.Display();
	}
}
