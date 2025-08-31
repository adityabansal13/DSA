package lec6;

import java.util.*;

public class printArmstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		printArms(n1, n2);

	}

	public static int count(int n) {
		int c = 0;
		while (n > 0) {
			n = n / 10;
			c++;
		}
		return c;
	}

	public static boolean isArms(int n) {
		int sum = 0;
		int org = n;
		int p = count(n);
		while (n > 0) {
			int rem = n % 10;
			sum += Math.pow(rem, p);
			n = n / 10;
		}
		if (org == sum)
			return true;
		else
			return false;
	}

	public static void printArms(int n1,int n2);
	
	for(int i = n1;i<=n2;i++)
	{
		// if(isArms(i) == true){
		// System.out.println(i);
		// }
		// else continue;
		System.out.println(i);
	}
}}
