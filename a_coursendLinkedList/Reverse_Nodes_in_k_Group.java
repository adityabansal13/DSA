package a_coursendLinkedList;

public class Reverse_Nodes_in_k_Group {

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
		public ListNode reverseKGroup(ListNode head, int k) {
			ListNode ans = reverse(head, k);
			return ans;
		}

		public static ListNode reverse(ListNode head, int k) {
			if (head == null) {
				return null;
			}
			ListNode temp = head;
			int count = 0;
			while (temp != null && count < k) {
				temp = temp.next;
				count++;
			}
			if (count < k) {
				return head;
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
}
