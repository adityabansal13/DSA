package a_practice;

import java.util.*;
import java.util.Scanner;

public class BinaryTree {
	Scanner sc = new Scanner(System.in);

	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;

	public BinaryTree() {
		root = createTree();
	}

	private Node createTree() {
		int val = sc.nextInt();
		Node nn = new Node();
		nn.val = val;
		boolean lf = sc.nextBoolean();
		if (lf) {
			nn.left = createTree();
		}
		boolean rf = sc.nextBoolean();
		if (rf) {
			nn.right = createTree();
		}
		return nn;
	}

	public void Display() {
		Display(root);
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

	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}
		int lt = max(nn.left);
		int rt = max(nn.right);
		return Math.max(lt, Math.max(rt, nn.val));
	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node nn, int item) {
		if (nn == null) {
			return false;
		}
		if (nn.val == item) {
			return true;
		}
		boolean left = find(nn.left, item);
		boolean right = find(nn.right, item);
		return left || right;
	}

	public int ht() {
		return ht(root);
	}

	private int ht(Node nn) {
		if (nn == null) {
			return -1;
		}
		int lt = ht(nn.left);
		int rt = ht(nn.right);
		return Math.max(lt, rt) + 1;
	}

	public void PreOrder() {
		PreOrder(root);
		System.out.println();
	}

	private void PreOrder(Node nn) {
		if (nn == null) {
			return;
		}
		String s = "";
		System.out.print(nn.val + " ");
		PreOrder(nn.left);
		PreOrder(nn.right);
	}

	public void InOrder() {
		InOrder(root);
		System.out.println();
	}

	private void InOrder(Node nn) {
		if (nn == null) {
			return;
		}
		InOrder(nn.left);
		System.out.print(nn.val + " ");
		InOrder(nn.right);
	}

	public void PostOrder() {
		PostOrder(root);
		System.out.println();
	}

	private void PostOrder(Node nn) {
		if (nn == null) {
			return;
		}
		PostOrder(nn.left);
		PostOrder(nn.right);
		System.out.print(nn.val + " ");
	}

	public void LevelOrder() {
		LevelOrder(root);
	}

	private void LevelOrder(Node nn) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node nv = q.poll();
			System.out.print(nv.val + " ");
			if (nv.left != null) {
				q.add(nv.left);
			}
			if (nv.right != null) {
				q.add(nv.right);
			}
		}
		System.out.println();

	}
}
