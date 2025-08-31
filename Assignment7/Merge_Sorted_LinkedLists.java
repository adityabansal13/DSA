package Assignment7;

import java.util.Scanner;

public class Merge_Sorted_LinkedLists {

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
		int m = sc.nextInt();
		ListNode l2 = null;
		ListNode tail2 = null;
		for (int i = 0; i < m; i++) {
			ListNode n2 = new ListNode(sc.nextInt());
			if (l2 == null) {
				l2 = n2;
				tail2 = n2;
			} else {
				tail2.next = n2;
				tail2 = tail2.next;
			}
		}
		ListNode ans = merge(l1, l2);
		while (ans != null) {
			System.out.print(ans.val + " ");
			ans = ans.next;
		}

	}

	public static ListNode merge(ListNode l1, ListNode l2) {
		ListNode head = new ListNode();
		ListNode tail = head;
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				tail.next = l1;
				l1 = l1.next;
			} else {
				tail.next = l2;
				l2 = l2.next;
			}
			tail=tail.next;
		}
		if (l1 != null) {
			tail.next = l1;
		} else {
			tail.next = l2;
		}
		return head.next;
	}

}
