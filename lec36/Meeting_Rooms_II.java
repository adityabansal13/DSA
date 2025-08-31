package lec36;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Meeting_Rooms_II {

	public static void main(String[] args) {
		int[][] arr = { { 9, 30 }, { 2, 10 }, { 15, 20 }, { 5, 12 }, { 12, 18 }, { 19, 25 } };
		System.out.println(Mini_Room(arr));
	}

	public static int Mini_Room(int[][] arr) {
		Arrays.sort(arr, (a, b) -> a[0] - b[0]); // Sorting on the basis of zeroth column of 2d matrices
		PriorityQueue<int []> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
		int room = 1;
		pq.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if(arr[i][0] < pq.peek()[1]) {
				pq.add(arr[i]);
				room = Math.max(room, pq.size());
				
			}
			else {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		return room;
		
	}

}
