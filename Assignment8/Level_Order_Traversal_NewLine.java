package Assignment8;

import java.util.*;

public class Level_Order_Traversal_NewLine {

	static class TreeNode {
		int val;
		TreeNode left, right;

		TreeNode(int val) {
			this.val = val;
		}
	}

	public static TreeNode buildTree(List<Integer> values) {
		if (values.isEmpty() || values.get(0) == -1)
			return null;

		Queue<TreeNode> queue = new LinkedList<>();
		TreeNode root = new TreeNode(values.get(0));
		queue.add(root);
		int index = 1;

		while (!queue.isEmpty() && index < values.size()) {
			TreeNode node = queue.poll();

			if (index < values.size() && values.get(index) != -1) {
				node.left = new TreeNode(values.get(index));
				queue.add(node.left);
			}
			index++;

			if (index < values.size() && values.get(index) != -1) {
				node.right = new TreeNode(values.get(index));
				queue.add(node.right);
			}
			index++;
		}

		return root;
	}

	// You need to implement this function to return a list of lists representing
	public static List<List<Integer>> levelOrderTraversal(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int size = q.size();
			List<Integer> ll = new ArrayList<>();
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
			result.add(ll);
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> values = new ArrayList<>();

		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				values.add(scanner.nextInt());
			} else if (scanner.next().equalsIgnoreCase("done")) {
				break;
			}
		}

		TreeNode root = buildTree(values);
		List<List<Integer>> levels = levelOrderTraversal(root);

		for (List<Integer> level : levels) {
			for (int n : level) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

		scanner.close();
	}
}
