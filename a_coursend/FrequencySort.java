package a_coursend;

import java.util.*;

public class FrequencySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 5, 6, 5, 4, 3 };
		System.out.println(sortByFrequency(nums));
	}

	public static List<Integer> sortByFrequency(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int a : nums) {
			if (map.containsKey(a)) {
				int v = map.get(a);
				map.put(a, v + 1);
			} else {
				map.put(a, 1);
			}
		}
		List<Integer> result = new ArrayList<>();
		for (int n : nums) {
			result.add(n);
		}
		Collections.sort(result, (a, b) -> {
			int fa = map.get(a);
			int fb = map.get(b);
			
			if(fa!=fb) {
				return fb-fa;
			}
			else {
				return a-b;
			}
		});
		return result;

	}

}
