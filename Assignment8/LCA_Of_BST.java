package Assignment8;

import java.util.Scanner;

public class LCA_Of_BST {

	static class Node {
		int val;
		Node left;
		Node right;

		Node(int val) {
			this.val = val;
		}
	}

	private Node root;

	public static Node insert(Node root, int val) {
		if (root == null) {
			return new Node(val);
		}
		if (val < root.val) {
			root.left = insert(root.left, val);
		} else {
			root.right = insert(root.right, val);
		}
		return root;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node root = null;
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			root = insert(root, val);
		}

		int p = sc.nextInt();
		int q = sc.nextInt();

		Node l = lca(root, p, q);

		System.out.println(l.val);
	}

	public static Node lca(Node root, int p, int q) {
		while (root != null) {
			if (p < root.val && q < root.val) {
				root = root.left;
			} else if (p > root.val && q > root.val) {
				root = root.right;
			} else {
				// p and q lie on different sides, or one equals root
				return root;
			}
		}
		return null;
	}
}
