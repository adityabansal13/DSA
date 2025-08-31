package lec15;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fact(n));
	}

	public static int fact(int n) {
		if(n==0) { 
			return 1;
		}
		//fact(1) = 1;
		int fn = fact(n - 1);
		return fn * n;
	}

}
