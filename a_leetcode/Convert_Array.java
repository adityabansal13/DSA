package a_leetcode;

// 1D array to 2D array convert

public class Convert_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] original = {1,2,3,4};
		int m = 2;
		int n = 2;
		int[][] arr = new int[m][n];
		int rc = 0; // row count
		int cc = 0;	// col count
		int i = 0;
		while (i < original.length) {
			cc = 0;
			while (cc < n && i < original.length) {
				arr[rc][cc] = original[i];
				//System.out.print(arr[rc][cc] + " ");
				cc++;
				i++;
			}
			rc++;
			//System.out.println();
		}
		for(int j=0;j<m;j++) {
			for(int k=0;k<n;k++) {
				System.out.print(arr[j][k] + " ");
			}
			System.out.println();
		}

	}
}
