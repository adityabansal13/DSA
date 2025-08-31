package a_coursendGraphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Is_Graph_Bipartite {

	class Solution {
		public boolean isBipartite(int[][] graph) {
			Queue<BipartitePair> q = new LinkedList<>();
			HashMap<Integer, Integer> visited = new HashMap<>();
			for (int key = 0; key < graph.length; key++) {
				if (visited.containsKey(key)) {
					continue;
				}
				q.add(new BipartitePair(key, 0));
				while (!q.isEmpty()) {
					// 1. remove
					BipartitePair rv = q.poll();
					// 2. ignore if already visited
					if (visited.containsKey(rv.vtx)) {
						if (visited.get(rv.vtx) != rv.dis) {
							return false;
						}
						continue;
					}
					// 3. mark visited
					visited.put(rv.vtx, rv.dis);
					// 4. (Nothing here)
					// 5. add unvisited nbrs
					for (int nbrs : graph[rv.vtx]) {
						if (!visited.containsKey(nbrs)) {
							q.add(new BipartitePair(nbrs, rv.dis + 1));
						}
					}
				}
			}
			return true;
		}
	}

	class BipartitePair {
		int vtx, dis;

		public BipartitePair(int vtx, int dis) {
			this.vtx = vtx;
			this.dis = dis;
		}
	}
}
