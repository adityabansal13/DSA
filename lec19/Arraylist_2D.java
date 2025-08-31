package lec19;

import java.util.ArrayList;
import java.util.List;

public class Arraylist_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> ll = new ArrayList<>();
		System.out.println(ll);
		ll.add(new ArrayList<>());
		ll.add(new ArrayList<>());
		ll.add(new ArrayList<>());
		System.out.println(ll);
		
		ll.get(1).add(10);
	}

}
