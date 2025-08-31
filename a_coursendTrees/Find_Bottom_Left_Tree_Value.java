package a_coursendTrees;

public class Find_Bottom_Left_Tree_Value {

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
		int maxd = -1;
		int lmv = 0;
		
		public int findBottomLeftValue(TreeNode root) {
			btm(root,0);
			return lmv;
		}
		
		public void btm(TreeNode root, int depth) {
			if(root==null) {
				return;
			}
			if(depth>maxd) {
				maxd = depth;
				lmv = root.val;
			}
			btm(root.left, depth+1);
			btm(root.right, depth+1);
		}
	}
}
