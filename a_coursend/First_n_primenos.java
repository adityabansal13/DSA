package a_coursend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class First_n_primenos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // kitne prime nos print krne h
		int count = 0;
		int x = 2;
		List<Integer> ll = new ArrayList<>();
		while (count < n) {
			int i = 2;
			for (; i < x; i++) {
				if (x % i == 0) {
					break;
				}
			}
			if (i == x) {
				//System.out.println(i);
				ll.add(i);
				count++;
			}
			x++;
		}
		System.out.println(ll);
//		System.out.println(ll.removeFirst());
		System.out.println(ll.get(0));
	}

}
