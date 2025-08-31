package Assignment8;

public class BST {
	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;

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

	// using insertion
	public static Node insert(Node root, int val) {
		if (root == null) {
			// return new Node(val);

			// iske liye Node class me ek constructor banao
			// Node(int val) this.val=val;
		}
		if (val < root.val) {
			root.left = insert(root.left, val);
		} else {
			root.right = insert(root.right, val);
		}
		return root;
	}

	public BST(int[] arr) {
		root = createTree(arr, 0, arr.length - 1);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
		BST bt = new BST(arr);
		System.out.println(bt);
	}

}
