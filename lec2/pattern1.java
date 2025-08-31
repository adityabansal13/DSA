package lec2;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		int row=1;
		while(row<=n) {
			//System.out.print(" * ");
			//i++;
			int col = 0;
			while(col<=n) {
				System.out.print("* ");
			col++;
			}
			System.out.println();
			row++;
		}
	}

}
