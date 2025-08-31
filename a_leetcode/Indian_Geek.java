package a_leetcode;

import java.util.Arrays;

public class Indian_Geek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int[][] arr = new int[n][n];
		int[] mid = new int[n*n];
		int i=0;
		for(int row=0;row<n;row++) {
			for(int col=0;col<n;col++) {
				arr[row][col] = (row+1)*(col+1);
				mid[i] = arr[row][col];
				i++;
			}
		}
		Arrays.sort(mid);
		for(int row=0;row<n;row++) {
			for(int col=0;col<n;col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
		for(int j=0;j<mid.length;j++) {
			System.out.print(mid[j] + " ");
		}
		System.out.println();
		
		
		if(n%2!=0) {
			System.out.println(mid[mid.length/2]);
		}
		else {
			System.out.println(mid[(mid.length-1)/2] + mid[mid.length/2]);
		}
	}

}
