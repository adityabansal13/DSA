package lec1;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		while(i<=n) {
			sum += i;
			i++;
		}
		System.out.println("Sum = "+ sum);
	}

}
