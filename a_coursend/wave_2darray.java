package a_coursend;

public class wave_2darray {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4,5},
					  {6,7,8,9,10},
					  {11,12,13,14,15},
					  {16,17,18,19,20}
					  };
		int n=4;
		int m=5;
		int row = 0;
		int col = 0;
		
		while(col<m) {
			while(row<n) {
				System.out.print(arr[row][col] + " ");
				row++;
			}
			col++;
			if(col==m) break;
			row--;
			while(row>=0) {
				System.out.print(arr[row][col] + " ");
				row--;
			}
			col++;
			row++;
		}
	}

}
