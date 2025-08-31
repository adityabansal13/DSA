package a_coursend;

public class Row_with_max_1s {

	public static void main(String[] args) {
		int[][] arr = { { 0, 1, 1, 1 }, 
						{ 0, 0, 1, 1 }, 
						{ 1, 1, 1, 1 }, 
						{ 0, 0, 0, 0 } };
		int idx = -1;
		int row = arr.length;
		int col = arr[0].length;
		int i = 0;
		int j = col-1;
		
		while(i<row && j>=0) {
			if(arr[i][j] == 1) {
				idx = i;
				j--;
			}
			else {
				i++;
			}
		}
		System.out.println(idx);
	}

}
