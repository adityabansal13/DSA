package a_coursend;

public class Merge_Two_Sorted_Arrays {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3 };
		int n = nums1.length;
		int[] nums2 = { 2, 5, 6 };
		int m = nums2.length;

		int[] arr = new int[n + m];
		int j = 0, k = 0, i = 0;

		while (i < n && j < m) {
			if (nums1[i] <= nums2[j]) {
				arr[k] = nums1[i];
				i++;
				k++;
			} else {
				arr[k] = nums2[j];
				k++;
				j++;
			}
		}
		while (i < n) {
			arr[k] = nums1[i];
			i++;
			k++;
		}
		while (j < m) {
			arr[k] = nums2[j];
			k++;
			j++;
		}

		for (int l = 0; l < arr.length; l++) {
			System.out.print(arr[l] + "  ");
		}

	}

}
