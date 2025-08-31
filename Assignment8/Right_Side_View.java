package Assignment8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Right_Side_View {
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
		List<Integer> ll = new ArrayList<>();

		rsv(root, 1, ll);

		for (int a : ll) {
			System.out.print(a + " ");
		}

	}

	static int maxd = 0;

	// You need to implement this function to return a list of lists representing
	public static void rsv(TreeNode root, int cl, List<Integer> ll) {
		if (root == null) {
			return;
		}
		if (maxd < cl) {
			ll.add(root.val);
			maxd = cl;
		}
		rsv(root.right, cl + 1, ll);
		rsv(root.left, cl + 1, ll);
	}
}
