package lec2;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		
		int row = 1;
		int space;
		while(row<=n) {
			space = n-row;
			int col =1;
			while(col<=space) {
				System.out.print("  ");
				col++;
			}
			col=1;
			while(col<=row) {
				//System.out.print( " ");
				System.out.print("* ");
				col++;
			}
			
			row++;
			System.out.println();
			
		}
	}

}
