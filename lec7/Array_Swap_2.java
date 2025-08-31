package lec7;

public class Array_Swap_2 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 6, 7, 8 };
		System.out.println(arr[0] + " " + arr[1]);
		Swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);
	}

	public static void Swap(int a, int b) {
		int c = a;
		a = b;
		b = c;
	}
}
