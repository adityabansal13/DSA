package lec40;

import java.util.*;

public class Is_Graph_Bipartite {

	// agar acyclic graph h to is definitely bipartite
	// agar cyclic hai lekin no. of edges EVEN hai to is bipartite
	// So
	// acylic yes
	// even cyclic yes
	// odd cyclic no

	class solution {
		public boolean isBipartite(int[][] graph) {
			// BFT
			Queue<BipartitePair> q = new LinkedList<>();
			HashMap<Integer, Integer> visited = new HashMap<>();
			q.add(new BipartitePair(0, 0));
			for (int i = 0; i < graph.length; i++) {
				if (visited.containsKey(i)) {
					continue;
				}
				q.add(new BipartitePair(i, 0));

				while (!q.isEmpty()) {
					// remove
					BipartitePair rp = q.poll();

					// ignore
					if (visited.containsKey(rp.vtx)) {
						if(visited.get(rp.vtx) != rp.dis) {
							return false;
						}
						continue;
					}

					// visited
					visited.put(rp.vtx, rp.dis);

					// self work

					// add unvisited nbrs
					for (int nbrs : graph[rp.vtx]) {
						if (!visited.containsKey(nbrs)) {
							q.add(new BipartitePair(nbrs, rp.dis + 1));
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
