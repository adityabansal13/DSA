package a_coursend;

import java.util.*;

public class Sort_Array_by_Increasing_Frequency {

	class Solution {
		public int[] frequencySort(int[] nums) {
			HashMap<Integer, Integer> map = new HashMap<>();
			List<Integer> ll = new ArrayList<>();
			for (int a : nums) {
				ll.add(a);
				if (map.containsKey(a)) {
					map.put(a, map.get(a) + 1);
				} else {
					map.put(a, 1);
				}
			}
			Collections.sort(ll, (a, b) -> {
				int fa = map.get(a);
				int fb = map.get(b);
				if(fa != fb) {
					return fa-fb;
				}
				else {
					return b-a;
				}	
			});
			for(int i=0;i<ll.size();i++) {
				nums[i] = ll.get(i);
			}
			return nums;
		}
	}
	
	
	
}
