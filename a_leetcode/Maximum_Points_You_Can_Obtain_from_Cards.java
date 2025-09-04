package a_leetcode;

public class Maximum_Points_You_Can_Obtain_from_Cards {

	class Solution {
		public int maxScore(int[] cardPoints, int k) {
			int maxsum = 0, lsum = 0, rsum = 0;
			int ridx = cardPoints.length - 1;
			for (int i = 0; i < k; i++) {
				lsum += cardPoints[i];
			}
			maxsum = lsum;
			for (int i = k - 1; i >= 0; i--) {
				lsum = lsum - cardPoints[i];
				rsum = rsum + cardPoints[ridx];
				maxsum = Math.max(maxsum, lsum+rsum);
				ridx--;
			}
			return maxsum;
		}
	}
}
