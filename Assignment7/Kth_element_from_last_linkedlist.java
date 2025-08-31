package Assignment7;

import java.util.Scanner;

public class Kth_element_from_last_linkedlist {

	// Definition for singly-linked list.
	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ListNode tail = null;
		ListNode head = null;
		while (true) {
			int a = sc.nextInt();
			if (a == -1) {
				break;
			}
			ListNode newNode = new ListNode(a);
			if (head == null) {
				head = newNode;
				tail = newNode;
			}else {
				tail.next = newNode;
				tail = newNode;
			}
		}
		int x = sc.nextInt();
		System.out.println(remove(head, x).val);

	}

	public static ListNode remove(ListNode head, int k) {
		ListNode slow = head;
		ListNode fast = head;
		int i = 0;
		while (i < k) {
			fast = fast.next;
			i++;
		}
		if (fast == null) {
			return head;
		}
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.next;
	}

}
