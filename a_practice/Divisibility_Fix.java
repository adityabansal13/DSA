package a_practice;

import java.io.*;
import java.util.*;

public class Divisibility_Fix {

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		public static int solveSingleCase(int n, int k, int[] arr) {
			if (k == 2) {
				// Find minimum increment needed to make any number even
				int minOps = Integer.MAX_VALUE;
				for (int x : arr) {
					minOps = Math.min(minOps, x % 2);
				}
				return minOps;
			}

			else if (k == 3) {
				// Calculate current product modulo 3
				int product = 1;
				for (int x : arr) {
					product = (product * x) % 3;
				}

				if (product == 0)
					return 0;

				// Try incrementing each number to find minimum operations
				int minOps = Integer.MAX_VALUE;
				for (int i = 0; i < n; i++) {
					int curr = arr[i];
					for (int ops = 0; ops < 3; ops++) { // We never need more than 2 increments
						if (product * ((curr + ops) % 3) % 3 == 0) {
							minOps = Math.min(minOps, ops);
						}
					}
				}
				return minOps;
			}

			else if (k == 4) {
				// Strategy 1: Make one number divisible by 4
				int minOps1 = Integer.MAX_VALUE;
				for (int x : arr) {
					int ops = (4 - (x % 4)) % 4;
					minOps1 = Math.min(minOps1, ops);
				}

				// Strategy 2: Make two numbers divisible by 2
				int minOps2 = Integer.MAX_VALUE;
				ArrayList<Integer> needsEven = new ArrayList<>();
				for (int x : arr) {
					if (x % 2 == 1) {
						needsEven.add(1);
					} else {
						needsEven.add(0);
					}
				}
				Collections.sort(needsEven);
				if (needsEven.size() >= 2) {
					minOps2 = needsEven.get(0) + needsEven.get(1);
				}

				return Math.min(minOps1, minOps2);
			}

			else if (k == 5) {
				// Find minimum increments needed to make any number end with 0 or 5
				int minOps = Integer.MAX_VALUE;
				for (int x : arr) {
					// Distance to next multiple of 5
					int ops = (5 - (x % 5)) % 5;
					minOps = Math.min(minOps, ops);
				}
				return minOps;
			}

			return -1; // Should never reach here given constraints
		}

		public static void main(String[] args) {
			FastReader fr = new FastReader();
			int t = fr.nextInt(); // number of test cases

			while (t-- > 0) {
				int n = fr.nextInt(); // size of array
				int k = fr.nextInt(); // divisor

				int[] arr = new int[n];
				for (int i = 0; i < n; i++) {
					arr[i] = fr.nextInt();
				}

				System.out.println(solveSingleCase(n, k, arr));
			}
		}
	}
}
