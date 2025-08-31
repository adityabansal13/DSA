package Assignment7;

import java.util.*;

class Sum_of_two_LinkedLists {

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
		int m = sc.nextInt();
		ListNode l1 = null;
		ListNode tail1 = null;
		ListNode l2 = null;
		ListNode tail2 = null;
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
		for (int i = 0; i < m; i++) {
			ListNode m2 = new ListNode(sc.nextInt());
			if (l2 == null) {
				l2 = m2;
				tail2 = m2;
			} else {
				tail2.next = m2;
				tail2 = tail2.next;
			}
		}
		ListNode l1rev = reverse(l1);
		ListNode l2rev = reverse(l2);
		ListNode sum = sum(l1rev, l2rev);
		ListNode sumfinal = reverse(sum);

		while (sumfinal != null) {
			System.out.print(sumfinal.val + " ");
			sumfinal = sumfinal.next;
		}

//		while (l1 != null) {
//			System.out.print(l1.val + " ");
//			l1 = l1.next;
//		}
//		System.out.println();
//		while (l2 != null) {
//			System.out.print(l2.val + " ");
//			l2 = l2.next;
//		}

	}

	public static ListNode sum(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode();
		ListNode temp = dummy;
		int carry = 0;
		while (l1 != null || l2 != null || carry == 1) {
			int sum = 0;
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			sum += carry;
			carry = sum / 10;
			ListNode n = new ListNode(sum % 10);
			temp.next = n;
			temp = temp.next;
		}
		return dummy.next;
	}

	public static ListNode reverse(ListNode head) {
		ListNode curr = head;
		ListNode prev = null;
		while (curr != null) {
			ListNode ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
		}
		return prev;
	}
}