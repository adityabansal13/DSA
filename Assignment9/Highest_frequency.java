package Assignment9;

import java.util.*;

public class Highest_frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int m = Integer.MIN_VALUE;
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (map.containsKey(a)) {
				int v = map.get(a);
				map.put(a, v + 1);
			} else {
				map.put(a, 1);
			}
		}
		
		int ans = 0;
		
		for(int k : map.keySet()) {
			if(map.get(k) > m) {
				m = map.get(k);
				ans = k;
			}
		}
		//System.out.println(map);
		System.out.println(ans);

	}

}
