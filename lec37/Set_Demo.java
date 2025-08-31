package lec37;

import java.util.HashSet;

public class Set_Demo {

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
		
		//get -> only checks the availability
		System.out.println(set.contains(19));
		
		//remove -> remove karega aur hoga to true return nahi to false 
		System.out.println(set.remove(3));
		System.out.println(set.remove(30));
		
		//size
		System.out.println(set.size());
		
		for(int v:set) {
			System.out.print(v + " ");
		}
		
	}

}
