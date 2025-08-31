package lec2;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		
		int row = 1;
		int space = 0;
		int star = n;
		while(row<=n) {
			int i =1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			//star 
			int j = 1;
			while(j<=star) {
				//System.out.print( " ");
				System.out.print("* ");
				j++;
			}
			row++;
			space += 2;
			star--;
			System.out.println();
			
		}
	}

}
