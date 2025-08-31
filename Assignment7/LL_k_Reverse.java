package Assignment7;

import java.util.Scanner;

public class LL_k_Reverse {

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
		int k = sc.nextInt();
		if (n == 0 || k == 0) {
			return;
		}
		k = k % n;
		if (k == 0) {
			k = n;
		}
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
		ListNode ans = reverse(l1, k);
		while (ans != null) {
			System.out.print(ans.val + " ");
			ans = ans.next;
		}
	}

	public static ListNode reverse(ListNode head, int k) {
		if (head == null) {
			return null;
		}
		ListNode curr = head;
		ListNode prev = null;
		int c = k;
		while (curr != null && c > 0) {
			ListNode ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
			c--;
		}
		head.next = reverse(curr, k);
		return prev;
	}

}
