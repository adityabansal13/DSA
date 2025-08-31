package Assignment8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Root_to_Leaf_BT {

	Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private Node root;
	int size;

	public Root_to_Leaf_BT(int rootData, Root_to_Leaf_BT leftST, Root_to_Leaf_BT rightST) {
		this.root = new Node(rootData, null, null);
		this.root.left = leftST != null ? leftST.root : null;
		this.root.right = rightST != null ? rightST.root : null;

		this.size += leftST != null ? leftST.size : 0;
		this.size += rightST != null ? rightST.size : 0;
		this.size += 1;
	}

	public Root_to_Leaf_BT() {

		this.root = this.takeInput(scn, null, false);
	}

	private Node takeInput(Scanner scn, Node parent, boolean isLeft) {
		if (parent == null) {
			// System.out.println("Enter the data for root ");
		} else {
			if (isLeft) {
				// System.out.println("Enter the data for left child of " + parent.data);
			} else {
				// System.out.println("Enter the data for right child of " + parent.data);
			}
		}

		int cData = scn.nextInt();

		Node child = new Node(cData, null, null);
		this.size++;

		// System.out.println("Do you have a left child for " + child.data);
		boolean choice = scn.nextBoolean();

		if (choice) {
			child.left = this.takeInput(scn, child, true);
		}

		// System.out.println("Do you have a right child for " + child.data);
		choice = scn.nextBoolean();

		if (choice) {
			child.right = this.takeInput(scn, child, false);
		}

		return child;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void display() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return this.toString(this.root);
	}

	private String toString(Node node) {
		if (node == null) {
			return "";
		}

		String retVal = "";

		if (node.left != null) {
			retVal += node.left.data + " => ";
		} else {
			retVal += "END" + " => ";
		}

		retVal += node.data;

		if (node.right != null) {
			retVal += " <= " + node.right.data;
		} else {
			retVal += " <= " + "END";
		}

		retVal += "\n";

		retVal += this.toString(node.left);
		retVal += this.toString(node.right);

		return retVal;
	}

	public void rootToLeaf(int k) {
		List<Integer> ll = new ArrayList<>();
		path(root, k, ll);
	}

	public void path(Node root, int sum, List<Integer> ll) {
		if (root == null) {
			return;
		}
		// Add current node to the path
		ll.add(root.data);

		// If it's a leaf node and sum matches, print the path
		if (root.left == null && root.right == null && root.data == sum) {
			for (int val : ll) {
				System.out.print(val + " ");
			}
			System.out.println();
		} else {
			// Recur for left and right with reduced sum
			path(root.left, sum - root.data, ll);
			path(root.right, sum - root.data, ll);
		}

		// backtracking ke liye
		ll.remove(ll.size() - 1);
	}

	public static void main(String[] args) {
		Root_to_Leaf_BT b1 = new Root_to_Leaf_BT();
		int k = b1.scn.nextInt();
		b1.rootToLeaf(k);
	}
}
