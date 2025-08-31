package Assignment8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Print_All_Leaf_Nodes_BT {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Node root = buildTree();
		printleafNodes(root);
	}

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	public static Node buildTree() {
		int rootData = scn.nextInt();
		if (rootData == -1) {
			return null;
		}

		Node root = new Node(rootData);
		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			Node current = q.poll();

			int leftData = scn.nextInt();
			if (leftData != -1) {
				current.left = new Node(leftData);
				q.add(current.left);
			}

			int rightData = scn.nextInt();
			if (rightData != -1) {
				current.right = new Node(rightData);
				q.add(current.right);
			}
		}

		return root;
	}

	public static void printleafNodes(Node root) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			System.out.print(root.data + " ");
		}
		printleafNodes(root.left);
		printleafNodes(root.right);
	}

}
