package a_coursendTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Level_Order_Traversal {

	// Definition for a binary tree node.
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
		public List<List<Integer>> levelOrder(TreeNode root) {
			List<List<Integer>> ans = new ArrayList<>();
			if (root == null)
				return ans;

			Queue<TreeNode> queue = new LinkedList<>();
			queue.add(root);

			while (!queue.isEmpty()) {
				int levelSize = queue.size();
				List<Integer> level = new ArrayList<>();

				for (int i = 0; i < levelSize; ++i) {
					TreeNode node = queue.poll();
					level.add(node.val);

					if (node.left != null)
						queue.add(node.left);
					if (node.right != null)
						queue.add(node.right);
				}

				ans.add(level);
			}

			return ans;
		}
	}
}
