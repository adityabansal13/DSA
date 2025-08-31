package a_coursendSlidingWindow;

public class Maximum_SubArray_sum_of_size_k {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 3, 4, 5, 6, 7, 8, 9, 4, 5 };
		int k = 3;
		System.out.println(maxSum(arr, k));
	}

	public static int maxSum(int[] arr, int k) {
		int sum = 0;
		int ans = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		ans = sum;
		for (int i = k; i < arr.length; i++) {
			sum += arr[i]; // grow
			sum -= arr[i - k]; // shrink
			ans = Math.max(ans, sum);
		}
		return ans;
	}

}
