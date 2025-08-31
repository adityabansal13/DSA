package a_coursend;

import java.util.Scanner;

public class Exceptionhandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter dividend number: ");
		int a = sc.nextInt();
		System.out.print("Enter divisor number: ");
		int b = sc.nextInt();
		try {
			int div = a / b;
			System.out.println("Result is " + div);
		} catch (ArithmeticException e) {
			System.out.println("Divisor cannot be 0");
			System.out.println("Error: " + e);
		}
		System.out.println(a);
		System.out.println(b);
	}

}
