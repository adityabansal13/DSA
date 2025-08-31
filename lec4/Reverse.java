package lec4;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dig=0;
		while(n>0) {
			int rem = n%10;
			dig = dig*10 + rem;
			n=n/10;
		}
		System.out.println(dig);
	}
}
