package a_coursendHashMap;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		// add   //O(1)
		set.add(20);
		set.add(-2);
		set.add(2);
		set.add(190);
		set.add(69);
		set.add(97);
		set.add(1987);
		System.out.println(set);
		
//		// contains
//		System.out.println(set.contains(69));
//		System.out.println(set.contains(9));
//		
//		
//		// remove
//		System.out.println(set.remove(2));
//		
//		System.out.println(set);
//
//		for(int v:set) {
//			System.out.print(v + " ");
//		}
		
		
		TreeSet<Integer> set1 = new TreeSet<>();
		// add   // O(log(n))
		set1.add(20);
		set1.add(-2);
		set1.add(2);
		set1.add(190);
		set1.add(69);
		set1.add(97);
		set1.add(1987);
		System.out.println(set1);
		
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		// add   // O(1)
		set2.add(20);
		set2.add(-2);
		set2.add(2);
		set2.add(190);
		set2.add(69);
		set2.add(97);
		set2.add(1987);
		System.out.println(set2);
	}

}
