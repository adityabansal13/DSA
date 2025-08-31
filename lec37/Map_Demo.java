package lec37;

import java.util.HashMap;

public class Map_Demo {

	public static void main(String[] args){
		//Hashmap me data sequence me nahi aata
		HashMap<String, Integer> map = new HashMap<>(); 
		//add O(1)time
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
		//map.put(null, null); //it can accept null as a key only once
		System.out.println(map); //jis order me daala us order me print nahi hoga
		
		//get
		System.out.println(map.get("Ankitaa"));
		System.out.println(map.get("Ankita"));
		
		//remove
		System.out.println(map.remove("Ankitaa"));
		System.out.println(map.remove("Ankita"));
		System.out.println(map);
		
		//contains key (it is case sensitive)
		System.out.println(map.containsKey("Ankur"));
		System.out.println(map.containsKey("Kunal"));
		System.out.println(map.containsValue(67));
		
		//size
		System.out.println(map.size());
		
	}

}
