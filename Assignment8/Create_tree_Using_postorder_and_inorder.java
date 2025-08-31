package Assignment8;

import java.util.Scanner;

public class Create_tree_Using_postorder_and_inorder {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Create_tree_Using_postorder_and_inorder m = new Create_tree_Using_postorder_and_inorder();
		int[] post = takeInput();
		int[] in = takeInput();
		BinaryTree bt = m.new BinaryTree(post, in);
		bt.display();
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

		public BinaryTree(int[] post, int[] in) {
			this.root = this.construct(post, 0, post.length - 1, in, 0, in.length - 1);
		}

		private Node construct(int[] post, int plo, int phi, int[] in, int ilo, int ihi) {
			// write your code here
			if (ilo > ihi || plo > phi) {
				return null;
			}
			Node root = new Node();
			root.data = post[phi];

			int idx = search(in, ilo, ihi, post[phi]);
			int ne = idx - ilo;

			root.left = construct(post, plo, plo + ne - 1, in, ilo, idx - 1);
			root.right = construct(post, plo + ne, phi - 1, in, idx + 1, ihi);

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
