package a_coursendSlidingWindow;

import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {

	class Solution {
		public int lengthOfLongestSubstring(String s) {
//			s = "cadbzabcd"
			HashMap<Character, Integer> map = new HashMap<>();
			int len = 0;
			int maxlen = 0;
			int l = 0;
			int r = 0;
			while (r < s.length()) {
				char x = s.charAt(r);
				if (map.containsKey(x)) {
					if (map.get(x) >= l) {
						l = map.get(x) + 1;
					}
				}
				map.put(x, r);
				len = r - l + 1;
				maxlen = Math.max(maxlen, len);
				r++;
			}
			return maxlen;
		}
	}

}
