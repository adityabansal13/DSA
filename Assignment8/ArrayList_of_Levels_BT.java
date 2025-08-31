package Assignment8;

import java.util.*;

public class ArrayList_of_Levels_BT {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList_of_Levels_BT m = new ArrayList_of_Levels_BT();
		BinaryTree bt1 = m.new BinaryTree();
		System.out.println(bt1.levelArrayList());
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public ArrayList<ArrayList<Integer>> levelArrayList() {
			// write your code here
			ArrayList<ArrayList<Integer>> result = new ArrayList<>();
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			while(!q.isEmpty()) {
				int size = q.size();
				ArrayList<Integer> lvl = new ArrayList<>();
				for (int i = 0; i < size; i++) {
					Node rv = q.poll();
					lvl.add(rv.data);
					if(rv.left!=null) {
						q.add(rv.left);
					}
					if(rv.right!=null) {
						q.add(rv.right);
					}
				}
				result.add(lvl);
			}
			return result;
		}

	}

}
