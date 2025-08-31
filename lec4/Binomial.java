package lec4;

import java.util.*;

public class Binomial {

	static int binomialCoeff(int n, int k) {
		int res = 1;

		if (k > n - k)
			k = n - k;

		for (int i = 0; i < k; ++i) {
			res *= (n - i);
			res /= (i + 1);
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = sc.nextInt();
		
		
	}
}
