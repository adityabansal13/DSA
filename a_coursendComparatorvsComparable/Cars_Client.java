package a_coursendComparatorvsComparable;

// comparable
public class Cars_Client {

	public static void main(String[] args) {
		Cars[] arr = new Cars[5];

		arr[0] = new Cars(100, 11, "grey");
		arr[1] = new Cars(200, 10, "white");
		arr[2] = new Cars(500, 19, "black");
		arr[3] = new Cars(900, 69, "blue");
		arr[4] = new Cars(400, 50, "pink");

		Display(arr);
		sort(arr);
		System.out.println();
		Display(arr);
	}

	public static void Display(Cars[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + " ");
		}
	}

	public static <T extends Comparable<T>> void sort(T[] arr) {
		for (int turn = 1; turn < arr.length; turn++) {
			for (int i = 0; i < arr.length - turn; i++) {
				if (arr[i].compareTo(arr[i + 1]) > 0) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

}
