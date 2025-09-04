package AssignmentGraphs;

import java.util.*;

public class Is_Bipartite {

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
					BipartitePair rp = q.poll();

					// 2. ignore
					if(visited.containsKey(rp.vtx)) {
						if(visited.get(rp.vtx) != rp.dis) {
							return false;
						}
						continue;
					}

					// 3. mark visited
					visited.put(rp.vtx, rp.dis);

					// 4. self work XX

					// 5. add unvisited nbrs
					for (int nbrs : graph[rp.vtx]) {
						if (!visited.containsKey(nbrs)) {
							q.add(new BipartitePair(nbrs, rp.dis + 1));
						}
					}

				}
			}
			return true;
		}

		class BipartitePair {
			int vtx;
			int dis;

			public BipartitePair(int vtx, int dis) {
				this.vtx = vtx;
				this.dis = dis;
			}
		}

	}

}
