package a_coursend;

import java.util.*;

public class Minimum_area_to_cover_ones {

	public static void main(String[] args) {
		List<List<Integer>> ll = new ArrayList<>();
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();

		l1.add(0);
		l1.add(1);
		l1.add(0);

		l2.add(1);
		l2.add(0);
		l2.add(1);

		ll.add(l1);
		ll.add(l2);

		System.out.println(ll);
//		System.out.println(ll.size());
//		System.out.println(l1.size());

		int[][] arr = new int[ll.size()][l1.size()];

		for (int i = 0; i < ll.size(); i++) {
			int j = 0;
			for (int x : ll.get(i)) {
				arr[i][j] = x;
				j++;
			}
		}

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[0].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}

		int minr = arr.length;
		int maxr = -1;
		int minc = arr[0].length;
		int maxc = -1;

		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[0].length; c++) {
				if (arr[r][c] == 1) {
					if (r < minr) {
						minr = r;
					}
					if (r > maxr) {
						maxr = r;
					}
					if (c < minc) {
						minc = c;
					}
					if (c > maxc) {
						maxc = c;
					}
				}
			}
		}
		int ht = maxr - minr + 1;
		int wt = maxc - minc + 1;

		System.out.println(ht * wt);

	}

}
