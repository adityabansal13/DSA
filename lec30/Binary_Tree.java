package lec30;

import java.util.*;
import java.util.LinkedList;

public class Binary_Tree {
	Scanner sc = new Scanner(System.in);

	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;

	public Binary_Tree() {
		root = CreateTree();
	}

	private Node CreateTree() {
		int val = sc.nextInt();
		Node nn = new Node();
		nn.val = val;
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = CreateTree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = CreateTree();
		}
		return nn;
	}

	public void Display() {
		Display(root);
	}
	
	
	private void Display(Node node) {
		if(node==null) {
			return;
		}
		String s = "";
		s = "<--" + node.val + "-->";
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
		if(nn == null) {
			return Integer.MIN_VALUE;
		}
		int l  = max(nn.left);
		int r  = max(nn.right);
		return Math.max(l, Math.max(r, nn.val));
	}
	
	
	public boolean find(int item) {
		return find(root,item);
	}
	
	private boolean find(Node nn, int item) {
		if(nn==null) {
			return false;
		}
		if(nn.val==item) {
			return true;
		}
		boolean left = find(nn.left,item);
		boolean right = find(nn.right,item);
		return left||right;
	}
	
	public int ht() {
		return ht(root);
	}
	private int ht(Node node) {
		if(node==null) {
			return -1;
		}
		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh)+1;
		
	}
	
	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}
	private void PreOrder(Node node) {
		if(node==null) {
			return;
		}
		System.out.print(node.val+" ");
		PreOrder(node.left);
		PreOrder(node.right);
	}
	
	
	public void INOrder() {
		INOrder(this.root);
		System.out.println();
	}
	private void INOrder(Node node) {
		if(node ==null) {
			return;
		}
		INOrder(node.left);
		System.out.print(node.val + " ");
		INOrder(node.right);
	}
	
	
	public void PostOrder() {
		PostOrder(this.root);
		System.out.println();
	}
	private void PostOrder(Node node) {
		if(node==null) {
			return;
		}
		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.val + " ");
	}
	
	
	public void LevelOrder() {
		LinkedList<Node> ll = new LinkedList<>(); //addlast
		Queue<Node> q = new LinkedList<>();
		q.add(root); //add last
		while(!q.isEmpty()) {
			Node rv = q.poll(); //q.remove() remove first 
			System.out.print(rv.val + " ");
			if(rv.left != null) {
				q.add(rv.left);
			}
			if(rv.right != null) {
				q.add(rv.right);
			}
		}
		System.out.println();
	}

}
