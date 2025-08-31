package a_coursendSlidingWindow;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2 };
		int k = 10;
		System.out.println(product_less_than_k(arr, k));
	}

	public static int product_less_than_k(int[] arr, int k) {
		int si = 0;
		int ei = 0;
		int p = 1;
		int ans = 0;
		while (ei < arr.length) {
			// growing
			p = p * arr[ei];
			// shrink
			while (p >= k) {
				p = p / arr[si];
				si++;
			}
			// calculating answer
			ans = ans + (ei - si + 1);
			ei++;
		}
		return ans;
	}
}
