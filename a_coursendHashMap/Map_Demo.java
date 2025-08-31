package a_coursendHashMap;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Map_Demo {

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
		
		TreeMap<String, Integer> map1 = new TreeMap<>();
		// put // O(log(n))
		map1.put("Aditya", 81);
		map1.put("Arnav", 90);
		map1.put("Ankit", 69);
		map1.put("Paras", 58);
		map1.put("Goldy", 79);
		map1.put("Kaju", 99);
		map1.put("Jugal", 33);
		System.out.println(map1);
		
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// put // log(n)
		map2.put("Aditya", 81);
		map2.put("Arnav", 90);
		map2.put("Ankit", 69);
		map2.put("Paras", 58);
		map2.put("Goldy", 79);
		map2.put("Kaju", 99);
		map2.put("Jugal", 33);
		System.out.println(map2);
		
		for(String key : map2.keySet()) {
			System.out.println(key + " " + map2.get(key));
		}
	}

}
