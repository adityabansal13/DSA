package a_coursendSlidingWindow;

import java.util.HashMap;

public class Subarray_Sum_Equals_K {
	class Solution {
		public int subarraySum(int[] nums, int k) {
			int i = 0;
			int cnt = 0;
			int preSum = 0;
			HashMap<Integer, Integer> map = new HashMap<>();
			map.put(0, 1);
			while (i < nums.length) {
				preSum += nums[i];
				if (map.containsKey(preSum - k)) {
					cnt += map.get(preSum - k);
				}
				if (map.containsKey(preSum)) {
					map.put(preSum, map.get(preSum) + 1);
				} else {
					map.put(preSum, 1);
				}
				i++;
			}

			return cnt;
		}
	}

}

//class Solution {
//public int subarraySum(int[] nums, int k) {
//	return subarray(nums, k) - subarray(nums, k - 1);
//}
//
//public int subarray(int[] nums, int k) {
//	if (k < 0) {
//		return 0;
//	}
//	int l = 0, r = 0;
//	int cnt = 0, sum = 0;
//	while (r < nums.length) {
//		sum += nums[r];
//		if (sum <= k) {
//			cnt = cnt + (r - l + 1);
//		}
//		if (sum > k) {
//			sum = sum - nums[l];
//			l++;
//		}
//		r++;
//	}
//	return cnt;
//}
//}
