package a_practice;

public class Board_PathLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int nos = 6;
		roll(n, 0, "", nos);
	}

	public static void roll(int n, int curr, String ans, int nos) {
		if(curr==n) {
			System.out.print(ans+" ");
			return;
		}
		if(curr>n) {
			return;
		}
		for (int dice = 3; dice <= nos; dice++) {
			roll(n, curr + dice, ans + dice, nos);
		}
	}
}
