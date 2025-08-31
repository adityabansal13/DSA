package lec2;

import java.util.Scanner;

public class pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		
		int row = 1;
		int space = 0;
		int count = 1;
		while(row<=2*n-1) {
			//count
			int i=1;
			int j=1;
			while(i<=count) {
				System.out.print(count + " ");
				i++;
				if(j<=space) {
					System.out.print("* ");
					j++;
				}
			}
			if(row<n) {
				count++;
				space++;
			}
			else {
				count--;
				space--;
			}
			row++;
			System.out.println();
		}
	}

}
