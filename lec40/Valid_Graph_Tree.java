package lec40;

import java.util.*;

public class Valid_Graph_Tree {

	class Solution {
		public boolean validTree(int n, int[][] edges) {
			HashMap<Integer, List<Integer>> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(i, new ArrayList<>());

			}
			for (int i = 0; i < edges.length; i++) {
				int a = edges[i][0];
				int b = edges[i][1];
				map.get(a).add(b);
				map.get(b).add(a);
			}
			return DFT(map);
		}

		public boolean DFT(HashMap<Integer, List<Integer>> map) {
			Stack<Integer> st = new Stack<>();
			HashSet<Integer> visited = new HashSet<>();
			int c = 0;
			for (int src : map.keySet()) {
				if (visited.contains(src)) {
					continue;
				}
				c++;
				st.push(src);
				while (!st.isEmpty()) {
					// 1. remove
					int rv = st.pop();

					// 2. Ignore
					// yha true lagado agar cyclic dekhna ho to
					if (visited.contains(rv)) {
						return false;
					}

					// 3. visited
					visited.add(rv);

					// 4. self work
					System.out.println(rv + " ");

					// 5. add nbrs
					for (int nbrs : map.get(rv)) {
						if (!visited.contains(nbrs)) {
							st.push(nbrs);
						}

					}
				}
			}
			return c == 1;

		}

	}
}
