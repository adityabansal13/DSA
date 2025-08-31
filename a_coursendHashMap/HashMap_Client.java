package a_coursendHashMap;

// ye humare implemented hashmap hai

public class HashMap_Client {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Aditya", 81);
		map.put("Arnav", 90);
		map.put("Ankit", 69);
		map.put("Paras", 58);
		map.put("Goldy", 79);
		map.put("Kaju", 99);
		map.put("Jugal", 33);
		map.put("Paras", 39);
		
		System.out.println(map.get("Ankit"));
		System.out.println(map.get("Paras"));
		System.out.println(map);

	}

}
