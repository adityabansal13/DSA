package a_coursendSlidingWindow;

public class Count_Number_of_Nice_Subarrays {

	class Solution {
		public int numberOfSubarrays(int[] nums, int k) {
			return subarrays(nums, k) - subarrays(nums, k - 1);
		}

		public int subarrays(int[] nums, int k) {
			int r = 0, l = 0;
			int sum = 0, cnt = 0;
			while (r < nums.length) {
				if (nums[r] % 2 != 0) {
					sum++;
				}
				while (sum > k) {
					if (nums[l] % 2 != 0) {
						sum--;
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
