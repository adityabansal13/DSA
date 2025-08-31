package lec1;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int i = 1;
		while(i<=10) {
			System.out.printf("%d * %d = %d \n",n,i,(i*n));
			i++;
		}
	}

}
