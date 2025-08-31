package lec6;

import java.util.Scanner;


public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(arms(n));
	}

	public static int power(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

	public static boolean arms(int n) {
		int sum = 0;
		int org = n;
		int count = power(n);
		while (n > 0) {
			int rem = n % 10;
			sum += Math.pow(rem,count);
			n = n / 10;
		}
		 if(org == sum) return true;
		 else return false;
	}
}
