package a_coursendHashMap;

import java.util.HashMap;

public class Valid_Anagram {

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		System.out.println(isAnagram(s, t));

	}

	public static boolean isAnagram(String s, String t) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				int v = map.get(s.charAt(i));
				map.put(s.charAt(i), v + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		for (int i = 0; i < t.length(); i++) {
			if (map.containsKey(t.charAt(i)) && map.get(t.charAt(i)) > 0) {
				int v = map.get(t.charAt(i));
				map.put(t.charAt(i), v - 1);
			} else {
				return false;
			}
		}
		for (int v : map.values()) {
			if (v > 0) {
				return false;
			}
		}
		return true;

	}

}
