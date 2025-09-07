package a_coursendSlidingWindow;

public class Binary_Subarrays_With_Sum {

	class Solution {
		public int numSubarraysWithSum(int[] nums, int goal) {
			int r = 0, l = 0;
			int sum = 0, cnt = 0;
			return subarrays(nums, goal) - subarrays(nums, goal - 1);
		}

		// this will give all the subarrays with sum <= goal
		public int subarrays(int[] nums, int goal) {
			if (goal < 0) {
				return 0;
			}
			int r = 0, l = 0;
			int sum = 0, cnt = 0;
			while (r < nums.length) {
				sum += nums[r];
				while (sum > goal) {
					sum = sum - nums[l];
					l++;
				}
				cnt = cnt + (r - l + 1);
				r++;
			}
			return cnt;
		}
	}
}
