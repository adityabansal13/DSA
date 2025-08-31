package a_coursendLinkedList;

public class Linked_List_Cycle_II {

	// Definition for singly-linked list.
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public ListNode detectCycle(ListNode head) {
			ListNode meet = hasCycle(head);
			if (meet == null) {
				return null;
			}
			ListNode slow = head;
			ListNode fast = meet;
			while (slow != fast) {
				slow = slow.next;
				fast = fast.next;
			}
			return fast;
		}

		public ListNode hasCycle(ListNode head) {
			ListNode slow = head;
			ListNode fast = head;
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
				if (slow == fast) {
					return slow;
				}
			}
			return null;
		}
	}
}
