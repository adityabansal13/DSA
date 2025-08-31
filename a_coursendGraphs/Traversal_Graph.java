package a_coursendGraphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Traversal_Graph {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Traversal_Graph(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public void BFT() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int key : map.keySet()) {
			if (visited.contains(key)) {
				continue;
			}
			q.add(key);
			while (!q.isEmpty()) {
				// 1. remove
				int rv = q.poll();

				// 2. ignore if visited
				if (visited.contains(rv)) {
					continue;
				}

				// 3. add visited
				visited.add(rv);

				// 4. self work
				System.out.print(rv + " ");

				// 5. add unvisited nbrs
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		System.out.println();
	}
	
	public void DFT() {
		Stack<Integer> s = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int key : map.keySet()) {
			if (visited.contains(key)) {
				continue;
			}
			s.push(key);
			while (!s.isEmpty()) {
				// 1. remove
				int rv = s.pop();

				// 2. ignore if visited
				if (visited.contains(rv)) {
					continue;
				}

				// 3. add visited
				visited.add(rv);

				// 4. self work
				System.out.print(rv + " ");

				// 5. add unvisited nbrs
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						s.push(nbrs);
					}
				}
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Traversal_Graph g = new Traversal_Graph(7);
		g.AddEdge(1, 4, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		g.BFT();
		g.DFT();
	}
}
