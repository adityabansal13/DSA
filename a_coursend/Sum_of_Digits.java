package a_coursend;

public class Sum_of_Digits {

	public static void main(String[] args) {
		int n = 2897;
		int s = sum(n);
		while (s > 9) {
			s = sum(s);
		}
		System.out.println(s);
	}

	public static int sum(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += rem;
			n = n / 10;
		}
		return sum;
	}

}
