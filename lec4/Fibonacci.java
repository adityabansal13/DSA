package lec4;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		int a=0;
		int b=1;
		System.out.print("0 ");
		for(int i=0;i<=n;i++) {
			int c = a+b;
			a=b;
			b=c;
			System.out.print(a + " ");
		}
		
	}

}
