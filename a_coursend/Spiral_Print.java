package a_coursend;

public class Spiral_Print {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		Print(arr);
	}

	public static void Print(int[][] arr) {
		int minr = 0;
		int minc = 0;
		int maxr = arr.length - 1;
		int maxc = arr[0].length - 1;
		int te = arr.length * arr[0].length;
		int c = 0;

		while (c < te) {
			for (int i = minc; i <= maxc && c < te; i++) {
				System.out.print(arr[minr][i] + " ");
			}
			minr++;
			for (int i = minr; i <= maxr && c < te; i++) {
				System.out.print(arr[i][maxc] + " ");
			}
			maxc--;
			for (int i = maxc; i >= minc && c < te; i--) {
				System.out.print(arr[maxr][i] + " ");
			}
			maxr--;
			for (int i = maxr; i >= minr && c < te ; i--) {
				System.out.print(arr[i][minc] + " ");
			}
			minc++;
		}
	}

}
