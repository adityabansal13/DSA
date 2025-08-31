package a_coursend;

public class Dutch_National_Flag {

	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };

		int left = 0;
		int right = nums.length - 1;
		int i = 0;
		while (i <= right) {
			if (nums[i] == 0) {
				int temp = nums[i];
				nums[i] = nums[left];
				nums[left] = temp;
				left++;
				i++;
			} else if (nums[i] == 1) {
				i++;
			} else {
				int temp = nums[i];
				nums[i] = nums[right];
				nums[right] = temp;
				right--;
			}
		}
		for (int j = 0; j < nums.length; j++) {
			System.out.print(nums[j] + " ");
		}

	}
}
