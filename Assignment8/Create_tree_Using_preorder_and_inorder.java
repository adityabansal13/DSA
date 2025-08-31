package Assignment8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Create_tree_Using_preorder_and_inorder {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Create_tree_Using_preorder_and_inorder m = new Create_tree_Using_preorder_and_inorder();
		int[] pre = takeInput();
		int[] in = takeInput();
		BinaryTree bt = m.new BinaryTree(pre, in);
		//bt.display();
		bt.displaylevel();
	}

	public static int[] takeInput() {
		int n = scn.nextInt();

		int[] rv = new int[n];
		for (int i = 0; i < rv.length; i++) {
			rv[i] = scn.nextInt();
		}

		return rv;
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree(int[] pre, int[] in) {
			this.root = this.construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
		}

		private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
			// write your code here
			if (ilo > ihi || plo > phi) {
				return null;
			}
			Node root = new Node();
			root.data = pre[plo];

			int idx = search(in, ilo, ihi, pre[plo]);
			int ne = idx - ilo;

			root.left = construct(pre, plo + 1, plo + ne, in, ilo, idx - 1);
			root.right = construct(pre, plo + ne + 1, phi, in, idx + 1, ihi);

			return root;

		}

		private int search(int[] in, int ilo, int ihi, int item) {
			for (int i = ilo; i <= ihi; i++) {
				if (in[i] == item) {
					return i;
				}
			}
			return -1;
		}

		public void displaylevel() {
			this.displaylevel(this.root);
		}

		private void displaylevel(Node node) {
			if (node == null) {
				return;
			}
			Queue<Node> q = new LinkedList<>();
			q.add(node);
			while (!q.isEmpty()) {
				Node rv = q.poll();
				System.out.print(rv.data + " ");
				if (rv.left != null) {
					q.add(rv.left);
				}
				if (rv.right != null) {
					q.add(rv.right);
				}
			}
		}

		public void display() {
			this.display(this.root);
		}

		private void display(Node node) {
			if (node == null) {
				return;
			}

			String str = "";

			if (node.left != null) {
				str += node.left.data;
			} else {
				str += "END";
			}

			str += " => " + node.data + " <= ";

			if (node.right != null) {
				str += node.right.data;
			} else {
				str += "END";
			}

			System.out.println(str);

			this.display(node.left);
			this.display(node.right);
		}

	}
}
