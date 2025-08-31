package lec2;

import java.util.Scanner;

public class pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();

		int row = 1;
		int space = 2*n+2;
		int star = 1;
		int count = 1;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print(" ");
				i++;
			}
			// star
			int j = 1;
			while (j <= star) {
				if (count < 10) {
					System.out.print(count + "  ");
				}
				else {
					System.out.print(count + " ");
				}
				count++;
				j++;
			}
			row++;
			System.out.println();
			space-=3;
			star += 2;
		}
	}

}
