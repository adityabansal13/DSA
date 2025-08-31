package a_coursendLinkedList;

import Assignment7.LL_OddEven.ListNode;

public class Odd_Even_Linked_List {

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

	class Solution {
		public ListNode oddEvenList(ListNode head) {
			if (head == null || head.next == null) {
				return head;
			}
			ListNode o = head;
			ListNode e = head.next;
			ListNode evenhead = e;
			while (e != null && e.next != null) {
				o.next = e.next;
				o = o.next;
				e.next = o.next;
				e = e.next;
			}
			o.next = evenhead;
			return head;
		}
	}
}
