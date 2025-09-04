package Assignment9;

import java.util.*;

public class Unlock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		int[] arr = new int[n];

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			map.put(arr[i], i);
		}

		int i = 0;
		int want = n;

		while (i < n && k > 0 && want > 0) {
			if(arr[i] == want) {
				i++;
				want--;
				continue;
			}
			int idx = map.get(want);
			int val = arr[i];

			arr[i] = want;
			arr[idx] = val;

			map.put(want, i);
			map.put(val, idx);

			k--;
			i++;
			want--;
		}

		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

}
