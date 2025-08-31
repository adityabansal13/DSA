package a_coursendHeap;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue_Demo {
	public static void main(String[] args) {

		PriorityQueue<Integer> hp = new PriorityQueue<>(); // min heap
		PriorityQueue<Integer> hp1 = new PriorityQueue<>(Collections.reverseOrder()); // max heap
		hp.add(10);
		hp.add(20);
		hp.add(30);
		hp.add(1);
		hp.add(5);
		hp.add(7);
		hp.add(3);
		hp.add(2);
		hp.add(-4);
		System.out.println(hp);

		hp1.add(10);
		hp1.add(20);
		hp1.add(30);
		hp1.add(1);
		hp1.add(5);
		hp1.add(7);
		hp1.add(3);
		hp1.add(2);
		hp1.add(-4);
		System.out.println(hp1);
	}
}
