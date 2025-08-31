package a_coursend;

import java.util.HashMap;

public class Sum_of_Unique_Elements {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2 };
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int v = map.get(arr[i]);
				map.put(arr[i], v + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		int sum = 0;

		for (int r : map.keySet()) {
			if (map.get(r) == 1) {
				sum += r;
			}
		}
		System.out.println(sum);

	}

}
