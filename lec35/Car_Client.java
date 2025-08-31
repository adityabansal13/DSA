package lec35;

import java.util.Arrays;
import java.util.Comparator;

public class Car_Client {

	public static void main(String[] args) {
		Cars[] arr = new Cars[5];
		arr[0] = new Cars(200, 10, "White");// P S C
		arr[1] = new Cars(1000, 20, "Black");
		arr[2] = new Cars(345, 3, "Yellow");
		arr[3] = new Cars(34, 89, "Grey");
		arr[4] = new Cars(8907, 6, "Red");
		Arrays.sort(arr, new Comparator<Cars>() {

			@Override
			public int compare(Cars o1, Cars o2) {
				// TODO Auto-generated method stub
				return o1.price-o2.price;
			}
			
		});
		Arrays.sort(arr, new Comparator<Cars>() {

			@Override
			public int compare(Cars o1, Cars o2) {
				// TODO Auto-generated method stub
				return o2.speed-o1.speed;
			}
			
		});
		Arrays.sort(arr, new Comparator<Cars>() {

			@Override
			public int compare(Cars o1, Cars o2) {
				// TODO Auto-generated method stub
				return o1.color.compareTo(o2.color);
			}
			
		});
		//Sort(arr);
		Display(arr);
	}
	
	public static <T extends Comparable<T>>void sort(T[] arr) {
		for (int trun = 1; trun < arr.length; trun++) {
			for (int i = 0; i < arr.length - trun; i++) {
				if (arr[i].compareTo(arr[i + 1])>0) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
	
	public static <T> void Display(T[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

}
