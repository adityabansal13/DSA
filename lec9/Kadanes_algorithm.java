package lec9;

public class Kadanes_algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, -7, 5, -1, 8 };
		System.out.println(MaximumSum(arr));
	}

	public static int MaximumSum(int[] nums) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			ans = Math.max(sum, ans);
			if (sum < 0)
				sum = 0;
		}
		return ans;
	}

}
