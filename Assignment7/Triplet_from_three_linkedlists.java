package Assignment7;

import java.util.Scanner;

public class Triplet_from_three_linkedlists {

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
		int o = sc.nextInt();
		ListNode l1 = null;
		ListNode tail1 = null;
		ListNode l2 = null;
		ListNode tail2 = null;
		ListNode l3 = null;
		ListNode tail3 = null;
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
		for (int i = 0; i < o; i++) {
			ListNode o3 = new ListNode(sc.nextInt());
			if (l3 == null) {
				l3 = o3;
				tail3 = o3;
			} else {
				tail3.next = o3;
				tail3 = tail3.next;
			}
		}
		int target = sc.nextInt();
		triplet(l1, l2, l3, target);
//		ListNode ans = null;
//		while (ans != null) {
//			System.out.print(ans.val + " ");
//			ans = ans.next;
//		}
//		while (l1 != null) {
//			System.out.print(l1.val + " ");
//			l1 = l1.next;
//		}
	}

	public static void triplet(ListNode a, ListNode b, ListNode c, int target) {
		for (ListNode heada = a; heada != null; heada = heada.next) {
			for (ListNode headb = b; headb != null; headb = headb.next) {
				for (ListNode headc = c; headc != null; headc = headc.next) {
					if (heada.val + headb.val + headc.val == target) {
						System.out.println(heada.val + " " + headb.val + " " + headc.val);
						return;
					}
				}
			}
		}
		System.out.println("No combination");
	}

}
