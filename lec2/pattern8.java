package lec2;

import java.util.Scanner;

public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();

		int row = 1;
		int star = 1;
		int space = 0;
		while (row <= n) {
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			if (row == n) {

			}
			row++;
			System.out.println();
			star++;
			//8,20,32
		}
	}

}
