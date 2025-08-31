package lec2;

import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		
		int row = 1;
		int star = 2;
		int space = n-star;
		while(row<=n) {
			if(row==1 || row==n) {
				int i=1;
				while(i<=n) {
					System.out.print("* ");
					i++;
				}
				row++;
				System.out.println();
			}
			else {
				System.out.print("* ");
				int j=1;
				while(j<=space) {
					System.out.print("  ");
					j++;
				}
				System.out.print("* ");
				row++;
				System.out.println();
			}
		}
		
	}

}
