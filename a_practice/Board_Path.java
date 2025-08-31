package a_practice;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		roll(n, 0, "");
		//System.out.println(roll(n, 0, ""));
	}

	public static void roll(int end, int curr, String ans) {
		if (curr > end) {
			return;
		}
		if (curr == end) {
			System.out.print(ans + " ");
			return;
		}
		roll(end, curr + 1, ans + 1);
		roll(end, curr + 2, ans + 2);
		roll(end, curr + 3, ans + 3);
	}
	
	
	// to print the number of counts also
//	public static int roll(int end, int curr, String ans) {
//		if (curr > end) {
//			return 0;
//		}
//		if (curr == end) {
//			System.out.print(ans + " ");
//			return 1;
//		}
//		int a = roll(end, curr + 1, ans + 1);
//		int b = roll(end, curr + 2, ans + 2);
//		int c = roll(end, curr + 3, ans + 3);
//		
//		return a+b+c;
//	}

}
