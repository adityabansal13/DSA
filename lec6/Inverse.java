package lec6;

import java.util.Scanner;

public class Inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(inverse(n));
	}

	public static int inverse(int n) {
		int pos = 1;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += pos * (Math.pow(10, rem - 1));
			pos++;
			n = n / 10;
		}
		return sum;
	}
}
