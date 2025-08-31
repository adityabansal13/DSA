package a_blind45;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int[] prefix = new int[nums.length];
		int[] suffix = new int[nums.length];
		int[] ans = new int[nums.length];
		
		prefix[0] = 1;
		for (int i = 0; i < prefix.length - 1; i++) {
			prefix[i + 1] = prefix[i] * nums[i];
		}
		
		suffix[suffix.length - 1] = 1;
		for (int i = suffix.length - 2; i >= 0; i--) {
			suffix[i] = nums[i+1]*suffix[i+1];
		}
		
		for (int i = 0; i < ans.length; i++) {
			ans[i] = prefix[i]*suffix[i];
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

}
