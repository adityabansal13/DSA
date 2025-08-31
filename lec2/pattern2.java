package lec2;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		int row=1;
		while(row<=n) {
			int col = 1;
			while(col<=row) {
				System.out.print("* ");
				col++;
				
			}
			row++;
			System.out.println();
			
		}
	}
}


