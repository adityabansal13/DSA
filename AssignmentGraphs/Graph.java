package AssignmentGraphs;

import java.util.*;

public class Graph {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public void AddVtx(int v) {
		map.put(v, new HashMap<Integer, Integer>());
	}

	public boolean ContainsKey(int v1, int v2) {
		return map.get(v1).containsKey(v2);
	}

	public boolean ContainsVertex(int v1) {
		return map.containsKey(v1);
	}

	public int noodedge() {
		int size = 0;
		for (int i = 0; i < map.size(); i++) {
			size += map.get(i).size();
		}
		return size / 2;
	}

	public void removeEdge(int v1, int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}

	public void removeVertex(int v1) {
		for (int nbrs : map.get(v1).keySet()) {
			map.get(nbrs).remove(v1);
		}
		map.remove(v1);
	}

	public void display() {
		for (int key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}

	private boolean hasPath(int src, int des, HashSet<Integer> visited) {
		if (src == des) {
			return true;
		}
		visited.add(src);

		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				boolean ans = hasPath(nbrs, des, visited);
				if (ans) {
					return ans;
				}
			}
		}
		return false;
	}

	public boolean hasPath(int src, int des) {
		return hasPath(src, des, new HashSet<>());
	}

	private void PrintAllPath(int src, int des, HashSet<Integer> visited, String ans) {
		if (src == des) {
			System.out.println(ans + des);
			return;
		}
		visited.add(src);

		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				PrintAllPath(nbrs, des, visited, ans + src);
			}
		}
		visited.remove(src);
	}

	public void PrintAllPath(int src, int des) {
		PrintAllPath(src, des, new HashSet<>(), "");
	}

	public boolean BFS(int src, int des) {
		Queue<Integer> q = new LinkedList<>();
		q.add(src);
		HashSet<Integer> visited = new HashSet<>();
		while (!q.isEmpty()) {
			// 1. remove
			int rv = q.poll();

			// 2. ignore if already present
			if (visited.contains(rv)) {
				continue;
			}

			// 3. visited mark
			visited.add(rv);

			// 4. selfwork
			if (rv == des) {
				return true;
			}

			// 5. add unvisited nbrs
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}
		return false;
	}

	public boolean DFS(int src, int des) {
		Stack<Integer> st = new Stack<>();
		st.add(src);
		HashSet<Integer> visited = new HashSet<>();
		while (!st.isEmpty()) {
			// 1. remove
			int rv = st.pop();

			// 2. ignore if already present
			if (visited.contains(rv)) {
				continue;
			}

			// 3. visited mark
			visited.add(rv);

			// 4. selfwork
			if (rv == des) {
				return true;
			}

			// 5. add unvisited nbrs
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					st.push(nbrs);
				}
			}
		}
		return false;
	}

	public void BFT() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int components = 0;
		for (int key : map.keySet()) {
			if (visited.contains(key)) {
				components++; // this tells the number of disconnected graphs
				continue;
			}
			q.add(key);
			while (!q.isEmpty()) {
				// 1. remove
				int rv = q.poll();

				// 2. ignore
				if (visited.contains(rv)) { // this tells if cycle is present in graph
					continue;
				}

				// 3. visited add
				visited.add(rv);

				// 4. self work
				System.out.print(rv + " ");

				// 5. add univisited nbrs
				for (int nbrs : map.get(key).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
	}

	public void DFT() {
		Stack<Integer> st = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int key : map.keySet()) {
			int components = 0;
			if (!visited.contains(key)) {
				components++;
				continue;
			}
			st.add(key);
			while (!st.isEmpty()) {
				// 1. remove
				int rv = st.pop();

				// 2. ignore
				if (visited.contains(rv)) { // this tells if cycle is present in graph
					continue;
				}

				// 3. visited add
				visited.add(rv);

				// 4. self work
				System.out.print(rv + " ");

				// 5. add univisited nbrs
				for (int nbrs : map.get(key).keySet()) {
					if (!visited.contains(nbrs)) {
						st.push(nbrs);
					}
				}
			}
		}
	}
}
