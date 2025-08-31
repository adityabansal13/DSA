package lec37;

import java.util.*;

public class TreeSet_Demo {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(21);
		set.add(19);
		set.add(56);
		set.add(-26);
		set.add(3);
		set.add(-13);
		System.out.println(set);

		
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(1);
		set1.add(21);
		set1.add(19);
		set1.add(56);
		set1.add(-26);
		set1.add(3);
		set1.add(-13);
		System.out.println(set1);
		
		
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(1);
		set2.add(21);
		set2.add(19);
		set2.add(56);
		set2.add(-26);
		set2.add(3);
		set2.add(-13);
		System.out.println(set2);

	}

}
