package a_leetcode;

import java.util.HashMap;

public class Longest_Repeating_Character_Replacement {

	class Solution {
		public int characterReplacement(String s, int k) {
			// A A B A B B C C D
			// 0 1 2 3 4 5 6 7 8

			int maxf = 0;
			int frq = 0, maxlen = 0;
			int len = 0;
			int l = 0, r = 0;
			HashMap<Character, Integer> map = new HashMap<>();
			while (r < s.length()) {
				char x = s.charAt(r);
				if (map.containsKey(x)) {
					map.put(x, map.get(x) + 1);
					frq = map.get(x);
				} else {
					map.put(x, 1);
					frq = 1;
				}
				maxf = Math.max(maxf, frq);
				len = r - l + 1;
				if (len - maxf > k) {
					map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
					l++;
				}
				if (len - maxf <= k) {
					maxlen = Math.max(maxlen, len);
				}
				r++;
			}
			return maxlen;
		}
	}
}

//	class Solution {
//		public int characterReplacement(String s, int k) {
//			// A A B A B B C C D
//			// 0 1 2 3 4 5 6 7 8
//
//			int maxf = 0;
//			int frq = 0, maxlen = 0;
//			int len = 0;
//			int l = 0, r = 0;
//			int[] arr = new int[26];
//			Arrays.fill(arr, 0);
//
//			while (r < s.length()) {
//				char x = s.charAt(r);
//				arr[x - 'A'] = arr[x - 'A'] + 1;
//				maxf = Math.max(maxf, frq);
//				len = r - l + 1;
//				if (len - maxf > k) {
//					arr[s.charAt(l) - 'A'] = arr[s.charAt(l) - 'A'] + 1;
//					l++;
//				}
//				if (len - maxf <= k) {
//					maxlen = Math.max(maxlen, len);
//				}
//				r++;
//			}
//			return maxlen;
//		}
//	}
