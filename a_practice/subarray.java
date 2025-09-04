package a_practice;

import java.util.*;

public class subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3};
		
		List<List<Integer>> ll = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			List<Integer> curr = new ArrayList<>();
			for (int j = i; j < arr.length; j++) {
				curr.add(arr[j]);
				ll.add(new ArrayList<>(curr));
			}
		}
		
		System.out.println(ll);
	}

}
