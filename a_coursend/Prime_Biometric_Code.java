package a_coursend;

import java.util.*;

public class Prime_Biometric_Code {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int smallest = -1;
		int largest = -1;
		for (int i = start; i <= end; i++) {
			if (isValid(i)) {
				if (smallest == -1) {
					smallest = i;
				}
				largest = i;
			}
		}
		System.out.println(smallest + " " + largest);
	}

	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		if (n == 2 || n == 3) {
			return true;
		}
		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		for (int i = 5; i * i <= n; i += 6) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

	public static List<Integer> rotations(int num) {
		String s = String.valueOf(num);
		List<Integer> rotate = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			String rot = s.substring(i) + s.substring(0, i);
			rotate.add(Integer.parseInt(rot));
		}
		return rotate;
	}

	public static boolean isValid(int num) {
		if (!isPrime(num)) {
			return false;
		}
		for (int r : rotations(num)) {
			if (!isPrime(r)) {
				return false;
			}
		}
		return true;
	}

}
