package Assignment7;

import java.util.*;

public class LL_OddEven {

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
		ListNode ans = oddeven(l1);
		while (ans != null) {
			System.out.print(ans.val + " ");
			ans = ans.next;
		}
	}

	public static ListNode oddeven(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode curr = head;
		ListNode oddhead = null;
		ListNode oddtail = null;
		ListNode evenhead = null;
		ListNode eventail = null;
		while (curr != null) {
			if (curr.val % 2 != 0) {
				if (oddhead == null) {
					oddhead = curr;
					oddtail = curr;
				} else {
					oddtail.next = curr;
					oddtail = oddtail.next;
				}
			} else {
				if (evenhead == null) {
					evenhead = curr;
					eventail = curr;
				} else {
					eventail.next = curr;
					eventail = eventail.next;
				}
			}
			curr = curr.next;
		}
		if (oddhead == null) {
			return evenhead;
		}
		oddtail.next = evenhead;
		if (eventail != null) {
			eventail.next = null;
		}
		return oddhead;
	}

}
