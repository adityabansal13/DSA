package lec37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Intersection_of_Two_Arrays_II {

	public static void main(String[] args) {
		int[] nums1 = { 4, 9, 5 };
		int[] nums2 = { 9, 4, 9, 8, 4 };
		System.out.println(Arrays.toString(Intersect_of_Two_Arrays(nums1,nums2)));
	}

	public static int[] Intersect_of_Two_Arrays(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr1.length; i++) {
			if(map.containsKey(arr1[i])) {
				map.put(arr1[i], map.get(arr1[i])+1);
			}
			else {
				map.put(arr1[i], 1);
			}
		}
		ArrayList<Integer> ll = new ArrayList<>();
		for(int i=0;i<arr2.length;i++) {
			if(map.containsKey(arr2[i]) && map.get(arr2[i])>0) {
				ll.add(arr2[i]);
				map.put(arr2[i], map.get(arr2[i])-1);
			}
		}
		int[] ans = new int[ll.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = ll.get(i);
		}
		return ans;
	}

}
