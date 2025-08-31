package a_leetcode;

public class Search_in_Rotated_Sorted_Array_ii {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println(search(arr, 0));

	}

	public static boolean search(int[] nums, int target) {
		int n = nums.length;
		int s = 0;
		int e = n - 1;
		while (s <= e) {
			int mid = (s + e) / 2;

			if (nums[mid] == target) {
				return true;
			}

			if (nums[s] == nums[mid] && nums[mid] == nums[e]) {
				s = s + 1;
				e = e - 1;
				continue;
			}

			if (nums[s] <= nums[mid]) {
				if (nums[s] <= target && target <= nums[mid]) {
					e = e - 1;
				} else {
					s = s + 1;
				}
			}

			else {
				if (nums[mid] <= target && target <= nums[e]) {
					s = mid + 1;
				} else {
					e = mid - 1;
				}
			}
		}
		return false;
	}

}
