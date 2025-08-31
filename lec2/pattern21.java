package lec2;

import java.util.Scanner;

public class pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		
		int row = 1;
		int space = 2*n-3;
		int star = 1;
		while(row<=n) {
			//star
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//space
			int j = 1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			//star
			int k = 1;
//			while(k<=star) {
//				if(k!=n) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.println("");
//				}
			if(row==n) k++;
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			row++;
			System.out.println();
			space -= 2;
			star++;
		}
	}

}
