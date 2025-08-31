package lec14;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 9;
		System.out.println(x);
		
		Integer x1 = 9;
		System.out.println(x1);
		
		long l = 78;
		System.out.println(l);
		
		Long l1 = 69l;
		System.out.println(l1);
		
		x1 = x; // auto-boxing
		
		l = l1; //unboxing
		
		Integer[] ar = new Integer[6]; // default values null
		
		int[] arr = new int[6]; // default values zero
		
		Integer p1 = 69;
		Integer p2 = 69;
		Integer p3 = 128;
		Integer p4 = 128;
		System.out.println(p1==p2);
		System.out.println(p3==p4);
		
		
	}

}
