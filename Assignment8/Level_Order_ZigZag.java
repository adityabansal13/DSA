package Assignment8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Level_Order_ZigZag {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Level_Order_ZigZag m = new Level_Order_ZigZag();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderZZ();
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public void levelOrderZZ() {
			// write your code here
			List<List<Integer>> res = new ArrayList<>();
			if (root == null) {
				return;
			}
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			while (!q.isEmpty()) {
				int size = q.size();
				List<Integer> ll = new LinkedList<>();

				for (int i = 0; i < size; i++) {
					Node rv = q.poll();
					ll.add(rv.data);
					if (rv.left != null) {
						q.add(rv.left);
					}
					if (rv.right != null) {
						q.add(rv.right);
					}
				}
				res.add(ll);
			}
			for (int i = 0; i < res.size(); i++) {
				if (i % 2 == 1) {
					Collections.reverse(res.get(i));
				}
			}
			for(List<Integer> pr:res) {
				for(int a:pr) {
					System.out.print(a + " ");
				}
			}
		}

	}

}
