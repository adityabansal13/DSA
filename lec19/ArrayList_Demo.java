package lec19;
import java.util.*;
public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll.size());
		// max size of arraylist is = 10
		//by default size is zero
		// arraylist grows by 1.5x if it gets full
		//agar 10 elements daalke arraylist full hogyi to ek new list banegi of max size 15
		
		ll.add(10);
		ll.add(20);
		//ll.add(30);
		System.out.println(ll);
		System.out.println(ll.size());
	}

}
