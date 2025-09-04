package a_leetcode;

public class Max_Consecutive_Ones {

	class Solution {
		public int findMaxConsecutiveOnes(int[] nums) {

			// {1,1,0,1,1,1}

			int len = 0;
			int maxlen = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 1) {
					len++;
				} else {
					len = 0;
				}
				maxlen = Math.max(maxlen, len);
			}
			return maxlen;
		}
	}
}
