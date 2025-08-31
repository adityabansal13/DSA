package a_coursendTrees;

public class BST_to_GreaterSumTree {

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
		public TreeNode bstToGst(TreeNode root) {
			grsum(root);
			return root;
		}

		int sum = 0;

		public void grsum(TreeNode root) {
			if (root == null) {
				return;
			}
			bstToGst(root.right);
			sum += root.val;
			root.val = sum;
			bstToGst(root.left);
		}
	}
}
