package a_coursendTrees;

public class Balanced_Binary_Tree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public boolean isBalanced(TreeNode root) {
			return balancepair(root).isbal;
		}

		public BalancePair balancepair(TreeNode root) {
			if (root == null) {
				return new BalancePair();
			}
			BalancePair lbp = balancepair(root.left);
			BalancePair rbp = balancepair(root.right);
			BalancePair sbp = new BalancePair();
			sbp.ht = Math.max(lbp.ht, rbp.ht) + 1;
			boolean sb = Math.abs(lbp.ht - rbp.ht) <= 1;
			sbp.isbal = lbp.isbal && rbp.isbal && sb;
			return sbp;
		}

		class BalancePair {
			boolean isbal = true;
			int ht = -1;
		}
	}

}
