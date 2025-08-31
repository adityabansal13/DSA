package Assignment7;

import java.util.Scanner;

public class The_Queue_Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (arr[i] == 1) {
					count++;
				}
				if (arr[i] == 0) {
					count--;
				}
				if (count < 0) {
					//System.out.println("Invalid");
					break;
				}
			}
			if (count < 0) {
				System.out.println("Invalid");
			} else {
				System.out.println("Valid");
			}
			t--;
		}
	}
	
	

}
