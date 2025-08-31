package lec34;

public class Pair<K, V> {

	K x;
	V y;

	public Pair() {

	}

	public Pair(K x, V y) {
		this.x = x;
		this.y = y;
	}
	
	public static void main(String[] args) {
		Pair<String, Integer> p = new Pair<>();
		Pair<Character, Integer> p1 = new Pair<>();
	}
}
