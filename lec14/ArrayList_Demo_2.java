package lec14;

import java.util.*;

public class ArrayList_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<Integer>();
		ll.add(10);
		ll.add(5);
		ll.add(3);
		ll.add(8);
		ll.add(78);
		ll.add(10);
		ll.add(5);
		ll.add(3);
		ll.add(8);
		ll.add(78);
		System.out.println(ll);
		for(int i=0;i<ll.size();i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		
		for(int v:ll) {
			System.out.print(v + " ");
		}
		System.out.println();
		int[] arr = {1,2,3,4,5,6};
		for(int v:arr) {
			System.out.print(v + " ");
		}
	}
}
