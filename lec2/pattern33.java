package lec2;

import java.util.Scanner;

public class pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();

		int row = 1;
		int space = n-1;
		int count = 1;
		while(row<=n) {
			//space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			//number
			int j=n-row+1; // 9
			while(j<=n-1) {
				System.out.print(j + " ");
				j++;
			}
			// 0
			if(count==row) {
				System.out.print("0 ");
				count++;
			}
			// reverse numbers
			int k=n-1;
			while(k>=n-row+1) {
				System.out.print(k + " ");
				k--;
			}
			row++;
			System.out.println();
			space--;
			
		}
	}

}
