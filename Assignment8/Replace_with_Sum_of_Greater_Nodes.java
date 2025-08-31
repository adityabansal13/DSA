package Assignment8;

import java.util.Scanner;

public class Replace_with_Sum_of_Greater_Nodes {

	class Node {
		int val;
		Node left;
		Node right;
	}

	private static Node root;

	// using a sorted array
	private Node createTree(int[] arr, int si, int ei) {
		if (si > ei) {
			return null;
		}
		int mid = (si + ei) / 2;
		Node nn = new Node();
		nn.val = arr[mid];
		nn.left = createTree(arr, si, mid - 1);
		nn.right = createTree(arr, mid + 1, ei);
		return nn;
	}

	public Replace_with_Sum_of_Greater_Nodes(int[] arr) {
		root = createTree(arr, 0, arr.length - 1);
	}

	static int sum = 0;

	public static void grsum(Node root) {
		if (root == null) {
			return;
		}
		grsum(root.right);
		sum += root.val;
		root.val = sum;
		grsum(root.left);

	}

	public static void preorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		preorder(root.left);
		preorder(root.right);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Replace_with_Sum_of_Greater_Nodes bt = new Replace_with_Sum_of_Greater_Nodes(arr);
		// System.out.println(bt);
		grsum(root);
		preorder(root);
	}
}
