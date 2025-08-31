package a_practice;

public class PrintPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3; // row
		int m = 3; // col
		System.out.println(Path(n, m, 0, 0, ""));

	}

	public static int Path(int n, int m, int cr, int cc, String ans) {
		if (cc == m - 1 && cr == n - 1) {
			System.out.println(ans);
			return 1;
		}
		if (cr >= n || cc >= m) {
			return 0;
		}

		int a = Path(n, m, cr + 1, cc, ans + "V");
		int b = Path(n, m, cr, cc + 1, ans + "H");
		return a+b;
	}

}
