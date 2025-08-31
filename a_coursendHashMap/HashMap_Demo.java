package a_coursendHashMap;

import java.util.HashMap;

public class HashMap_Demo {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		// put  // O(1)
		map.put("Aditya", 81);
		map.put("Arnav", 90);
		map.put("Ankit", 69);
		map.put("Paras", 58);
		map.put("Goldy", 79);
		map.put("Kaju", 99);
		map.put("Jugal", 33);
		System.out.println(map);

		// check for any element
		// contains
		System.out.println(map.containsKey("Aaloo"));
		System.out.println(map.containsKey("Aditya"));
		System.out.println(map.containsValue(99));
		
		// value of any key
		// get
		System.out.println(map.get("Kaju"));
		System.out.println(map.get("Aniket"));
		
		// remove
		System.out.println(map.remove("Ankit"));
		System.out.println(map.remove("Aniket"));
		
		System.out.println(map);
		
		// size
		System.out.println(map.size());
		
		// looping on a map
		for(String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}

}
