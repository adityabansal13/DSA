package a_coursendTrees;

public class Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {

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
		public TreeNode buildTree(int[] inorder, int[] postorder) {
			return create(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
		}

		public TreeNode create(int[] in, int ilo, int ihi, int[] pos, int plo, int phi) {
			if (plo > phi || ilo > ihi) {
				return null;
			}
			TreeNode node = new TreeNode(pos[phi]);
			int idx = search(in, ilo, ihi, pos[phi]);
			int ne = idx - ilo;

			node.left = create(in, ilo, idx - 1, pos, plo, plo + ne - 1);
			node.right = create(in, idx + 1, ihi, pos, plo + ne, phi - 1);
			return node;

		}

		public int search(int[] arr, int si, int ei, int item) {
			for (int i = si; i <= ei; i++) {
				if (arr[i] == item) {
					return i;
				}
			}
			return -1;
		}
	}
}
