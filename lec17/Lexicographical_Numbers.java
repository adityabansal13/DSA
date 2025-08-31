package lec17;

public class Lexicographical_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int curr = 0;
		int n = 1000;
		Lexicographical_Counting(n, 0);
	}

	public static void Lexicographical_Counting(int n, int curr) {
		if (curr > n) {
			return;
		}
		System.out.println(curr);
		int i = 0;
		if (curr == 0) {
			i = 1;
		}

		for (; i <= 9; i++) {
			Lexicographical_Counting(n, curr * 10 + 1);
		}
	}
}
