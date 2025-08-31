package Assignment7;

import java.util.Scanner;

public class LinkedList_K_Append {

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
		int n = sc.nextInt();
		ListNode l1 = null;
		ListNode tail1 = null;
		for (int i = 0; i < n; i++) {
			ListNode n1 = new ListNode(sc.nextInt());
			if (l1 == null) {
				l1 = n1;
				tail1 = n1;
			} else {
				tail1.next = n1;
				tail1 = tail1.next;
			}
		}
		int k = sc.nextInt();
		k = k%n;
//		while (l1 != null) {
//		System.out.print(l1.val + " ");
//		l1 = l1.next;

		ListNode slow = l1;
		ListNode fast = l1;
		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		ListNode app = slow.next;
		slow.next = null;
		ListNode jod = app;
		while (jod.next != null) {
			jod = jod.next;
		}
		jod.next = l1;

		while (app != null) {
			System.out.print(app.val + " ");
			app = app.next;

		}
	}

}
