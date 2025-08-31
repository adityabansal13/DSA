package a_coursendGraphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BellManFord_Algorithm {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public BellManFord_Algorithm(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}

	class EdgePair {
		int e1;
		int e2;
		int cost;

		public EdgePair(int e1, int e2, int cost) {
			this.e1 = e1;
			this.e2 = e2;
			this.cost = cost;
		}

		public String toString() {
			return e1 + "-" + e2 + " @ " + cost;
		}
	}

	public List<EdgePair> getAllEdges() {
		List<EdgePair> ll = new ArrayList<>();
		for (int e1 : map.keySet()) {
			for (int e2 : map.get(e1).keySet()) {
				int cost = map.get(e1).get(e2);
				ll.add(new EdgePair(e1, e2, cost));
			}
		}
		return ll;
	}

	public void BellManFord() {
		int v = map.size();
		int[] dis = new int[v + 1];
		for (int i = 2; i < dis.length; i++) {
			dis[i] = 9999999;
		}
		List<EdgePair> ll = getAllEdges();
		for (int i = 1; i <= v; i++) {
			for (EdgePair e : ll) {
				if (i == v && dis[e.e2] > dis[e.e1] + e.cost) {
					System.out.println("-ve weight ka cycle hai");
					return;
				}
				if (dis[e.e2] > dis[e.e1] + e.cost) {
					dis[e.e2] = dis[e.e1] + e.cost;
				}
			}
		}
		for (int i = 1; i < dis.length; i++) {
			System.out.print(dis[i] + " ");
		}
	}

	public static void main(String[] args) {
		BellManFord_Algorithm bfd = new BellManFord_Algorithm(5);
		bfd.AddEdge(1, 2, 8);
//bfd.AddEdge(2, 5, -2);
		bfd.AddEdge(2, 5, 2);
		bfd.AddEdge(5, 2, 1);
		bfd.AddEdge(4, 5, 4);
		bfd.AddEdge(3, 4, -3);
		bfd.AddEdge(1, 3, 4);
		bfd.AddEdge(1, 4, 5);
		bfd.BellManFord();
	}
}