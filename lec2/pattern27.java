package lec2;

import java.util.Scanner;

public class pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();

		int row = 1;
		int space = n-1;
		int star = 1;
		while(row<=n) {
			//space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			//count mid
			int j=1;
			int val=1;
			while(j<=star) {
				System.out.print(val + " ");
				if(j<=star/2) {
					val++;
				}
				else {
					val--;
				}
				j++;
			}
			//count next
			//int k=star-1;
			//while(k<star && k>0) {
			//	System.out.print(k + " ");
			//	k--;
			//}
			row++;
			System.out.println();
			space--;
			star+=2;
		}
	}

}
