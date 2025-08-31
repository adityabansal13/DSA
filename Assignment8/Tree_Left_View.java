package Assignment8;

import java.util.*;
import java.io.*;

public class Tree_Left_View {

	public class Main {
		public static void main(String args[]) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] arr = br.readLine().split(" ");
			BinaryTree bt = new BinaryTree(arr);

			bt.leftView();

		}
	}

	static class BinaryTree {
		private class Node {
			int data;
			Node left, right;

			Node(int data) {
				this.data = data;
			}
		}

		Node root;

		BinaryTree(String[] arr) {
			Queue<Node> queue = new LinkedList<Node>();
			construct(arr, 0, queue);
		}

		public void leftView() {
			leftView(this.root);
		}

		private void leftView(Node root) {
			List<Integer> ll = new ArrayList<>();
			lsv(root, 1, ll);
			for (int a : ll) {
				System.out.print(a + " ");
			}
		}

		static int maxd = 0;

		public static void lsv(Node root, int cl, List<Integer> ll) {
			if (root == null) {
				return;
			}
			if (maxd < cl) {
				ll.add(root.data);
				maxd = cl;
			}
			lsv(root.left, cl + 1, ll);
			lsv(root.right, cl + 1, ll);
		}

		private void construct(String[] arr, int dummy, Queue<Node> queue) {
			if (arr.length == 0 || arr[0].equals("-1")) {
				root = null;
				return;
			}

			this.root = new Node(Integer.parseInt(arr[0]));
			queue.add(this.root);

			int i = 1;
			while (!queue.isEmpty() && i < arr.length) {
				Node parent = queue.poll();

				// Left child
				if (i < arr.length && !arr[i].equals("-1")) {
					parent.left = new Node(Integer.parseInt(arr[i]));
					queue.add(parent.left);
				}
				i++;

				// Right child
				if (i < arr.length && !arr[i].equals("-1")) {
					parent.right = new Node(Integer.parseInt(arr[i]));
					queue.add(parent.right);
				}
				i++;
			}
		}

		public void display() {
			display_tree(this.root);
		}

		private void display_tree(Node root) {
			if (root == null)
				return;
			String str = root.data + "";
			if (root.left != null) {
				str = root.left.data + " <= " + str;
			} else {
				str = "END <= " + str;
			}

			if (root.right != null) {
				str = str + " => " + root.right.data;
			} else {
				str = str + " => END";
			}
			System.out.println(str);
			display_tree(root.left);
			display_tree(root.right);

		}

	}
}
