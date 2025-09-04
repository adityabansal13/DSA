package a_coursendSlidingWindow;

import java.util.HashMap;

public class Fruit_into_Baskets {

	class Solution {
		public int totalFruit(int[] fruits) {
			// {3 3 3 1 2 1 1 2 3 3 4}
			int maxlen = 0, len = 0, l = 0, r = 0;
			HashMap<Integer, Integer> map = new HashMap<>();
			while (r < fruits.length) {
				if (map.containsKey(fruits[r])) {
					map.put(fruits[r], map.get(fruits[r]) + 1);
				} else {
					map.put(fruits[r], 1);
				}
				if (map.size() > 2) {
					map.put(fruits[l], map.get(fruits[l]) - 1);
					if (map.get(fruits[l]) == 0) {
						map.remove(fruits[l]);
					}
					l++;
				}
				len = r - l + 1;
				maxlen = Math.max(maxlen, len);
				r++;
			}
			return maxlen;
		}
	}
}
