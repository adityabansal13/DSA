package lec32;

public class Binary_Search_Tree {

	class Node {
		int val;
		Node left;
		Node right;
	}

	private static Node root;

	public Binary_Search_Tree(int[] in) {
		root = CreateTree(in, 0, in.length - 1);
	}

	private Node CreateTree(int[] in, int si, int ei) {
		if (si > ei) {
			return null;
		}
		int mid = (si + ei) / 2;
		Node nn = new Node();
		nn.val = in[mid];
		nn.left = CreateTree(in, si, mid - 1);
		nn.right = CreateTree(in, mid + 1, ei);
		return nn;
	}

	private void Display(Node node) {
		if (node == null) {
			return;
		}
		String s = "<--" + node.val + "-->";
		if (node.left != null) {
			s = node.left.val + s;
		} else {
			s = "." + s;
		}
		if (node.right != null) {
			s = s + node.right.val;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(node.left);
		Display(node.right);

	}

	public static void main(String[] args) {
		int[] in = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		Binary_Search_Tree bst = new Binary_Search_Tree(in);
		bst.Display(root);
	}
}
