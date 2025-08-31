package lec14;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll.size());
		System.out.println(ll);
		//add
		ll.add(5); // adds at last
		ll.add(10);
		ll.add(25);
		System.out.println(ll);
		
		ll.add(1,9); // adds at index
		System.out.println(ll);
		
		//get
		System.out.println(ll.get(1)); // fetches element at index
		
		//remove
		System.out.println(ll.remove(1));
		System.out.println(ll);
		
		//update
		ll.set(1, -12);
		System.out.println(ll);
	}

}
