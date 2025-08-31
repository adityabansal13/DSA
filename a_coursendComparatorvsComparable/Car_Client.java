package a_coursendComparatorvsComparable;

import java.util.*;

//comparator
public class Car_Client {

	public static void main(String[] args) {
		Car[] arr = new Car[5];

		arr[0] = new Car(100, 11, "grey");
		arr[1] = new Car(200, 10, "white");
		arr[2] = new Car(500, 19, "black");
		arr[3] = new Car(900, 69, "blue");
		arr[4] = new Car(400, 50, "pink");

		Display(arr);
		
		Arrays.sort(arr, new Comparator<Car>() {
			@Override
			public int compare(Car o1, Car o2) {
				return o1.price-o2.price;
			}
		});
		System.out.println();
		Display(arr);
		
		Arrays.sort(arr, new Comparator<Car>() {
			@Override
			public int compare(Car o1, Car o2) {
				return o2.speed-o1.speed;
			}
		});
		System.out.println();
		Display(arr);
		
		Arrays.sort(arr, new Comparator<Car>() {
			@Override
			public int compare(Car o1, Car o2) {
				return o1.color.compareTo(o2.color);
			}
		});
		System.out.println();
		Display(arr);
	}

	public static void Display(Car[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + " ");
		}
	}

//	public static <T extends Comparable<T>> void sort(T[] arr) {
//		for (int turn = 1; turn < arr.length; turn++) {
//			for (int i = 0; i < arr.length - turn; i++) {
//				if (arr[i].compareTo(arr[i + 1]) > 0) {
//					T temp = arr[i];
//					arr[i] = arr[i + 1];
//					arr[i + 1] = temp;
//				}
//			}
//		}
//	}

}
