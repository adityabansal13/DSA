package a_coursendSlidingWindow;

import java.util.HashMap;

public class Subarrays_with_K_Different_Integers {

	class Solution {
		public int subarraysWithKDistinct(int[] nums, int k) {
			return subarrays(nums, k) - subarrays(nums, k - 1);
		}

		// count the no. of subarrays with <= k integers
		public int subarrays(int[] nums, int k) {
			int l = 0, r = 0;
			int sum = 0, cnt = 0;
			HashMap<Integer, Integer> map = new HashMap<>();
			while (r < nums.length) {
				int x = nums[r];
				if (map.containsKey(x)) {
					map.put(x, map.get(x) + 1);
				} else {
					map.put(x, 1);
				}
				while (map.size() > k) {
					int le = nums[l];
					map.put(le, map.get(le) - 1);
					if (map.get(le) == 0) {
						map.remove(le);
					}
					l++;
				}
				cnt = cnt + (r - l + 1);
				r++;
			}
			return cnt;
		}
	}
}
