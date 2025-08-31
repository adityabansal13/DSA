package lec2;

import java.util.Scanner;

public class pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();

		int row = 1;
		while(row<=n) {
			int i=n;
			while(i>=1) {
				if(i!=row) {
					System.out.print(i + " ");
				}
				else {
					System.out.print("* ");
				}
				i--;
			}
			row++;
			System.out.println();
		}
	}

}
