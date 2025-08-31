package a_coursendTrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree_Zigzag_LevelOrderTraversal {

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
		public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
			List<List<Integer>> res = new ArrayList<>();
			if(root==null) {
				return res;
			}
			Queue<TreeNode> q = new LinkedList<>();
			q.add(root);
			while (!q.isEmpty()) {
				int size = q.size();
				List<Integer> ll = new LinkedList<>();
				
				for (int i = 0; i < size; i++) {
					TreeNode rv = q.poll();
					ll.add(rv.val);
					if (rv.left != null) {
						q.add(rv.left);
					}
					if (rv.right != null) {
						q.add(rv.right);
					}
				}
				res.add(ll);
			}
			for (int i = 0; i < res.size(); i++) {
			    if (i % 2 == 1) {
			        Collections.reverse(res.get(i));
			    }
			}
			return res;
		}
	}
}
