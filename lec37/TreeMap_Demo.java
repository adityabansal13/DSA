package lec37;

import java.util.*;

public class TreeMap_Demo {

	public static void main(String[] args) {
		// Hashmap me data sequence me nahi aata
		HashMap<String, Integer> map = new HashMap<>();
		// add O(1)time
		map.put("Raj", 87);
		map.put("Ankit", 57);
		map.put("Kunal", 78);
		map.put("Amit", 89);
		map.put("Mohan", 75);
		map.put("Shiva", 56);
		map.put("Pooja", 78);
		map.put("Hardik", 78);
		map.put("Ankit", 67);
		map.put("Ankita", 67);
		// map.put(null, null); //it can accept null as a key only once
		System.out.println(map); // jis order me daala us order me print nahi hoga

		
		
		// sorted data dega
		TreeMap<String, Integer> map1 = new TreeMap<>(); //red black tree se implement hota h
		// add O(1)time
		map1.put("Raj", 87);
		map1.put("Ankit", 57);
		map1.put("Kunal", 78);
		map1.put("Amit", 89);
		map1.put("Mohan", 75);
		map1.put("Shiva", 56);
		map1.put("Pooja", 78);
		map1.put("Hardik", 78);
		map1.put("Ankit", 67);
		map1.put("Ankita", 67);
		// map.put(null, 77); //null pointer exception bcoz while doing
		// comparison(o1.val - o2.val) null.something give null pointer exception
		System.out.println(map1);

		
		
		
		// jis order me daaloge usme milega
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>(); //doubly linked list se implement hota h
		// add O(1)time
		map2.put("Raj", 87);
		map2.put("Ankit", 57);
		map2.put("Kunal", 78);
		map2.put("Amit", 89);
		map2.put("Mohan", 75);
		map2.put("Shiva", 56);
		map2.put("Pooja", 78);
		map2.put("Hardik", 78);
		map2.put("Ankit", 67);
		map2.put("Ankita", 67);
		map2.put(null, 77); //null as value de sakte hai
		System.out.println(map2);
		
		
		Set<String> keyset = map.keySet();
		System.out.println(keyset);
		
		for(String key: map.keySet()) {
			System.out.println(key + " " + map.get(key) + " ");
		}
		System.out.println();

	}

}
