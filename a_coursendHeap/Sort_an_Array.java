package a_coursendHeap;

import java.util.PriorityQueue;

public class Sort_an_Array {

	public static void main(String[] args) {
		int[] nums = { 5, 1, 1, 2, 0, 0 };
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < nums.length; i++) {
			pq.add(nums[i]);
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = pq.poll();
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
	}

}
