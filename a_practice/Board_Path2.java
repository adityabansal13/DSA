package a_practice;

public class Board_Path2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		roll(n,0,"");
	}
	
	public static void roll(int end, int curr, String ans) {
		if (curr > end) {
			return;
		}
		if (curr == end) {
			System.out.print(ans + " ");
			return;
		}
//		roll(end, curr + 1, ans + 1);
//		roll(end, curr + 2, ans + 2);
//		roll(end, curr + 3, ans + 3);
		roll(end, curr + 4, ans + 4);
		roll(end, curr + 5, ans + 5);
		roll(end, curr + 6, ans + 6);
	}

}
