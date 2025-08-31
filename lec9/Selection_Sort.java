package lec9;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, -1, 5, 7, 3, -2, 1 };
		sort(arr);
		// System.out.println(min_form_ith_index(arr, 2));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int min_form_ith_index(int[] arr, int i) {
		int min = arr[i];
		int j = i;
		int k = j;
		while (j < arr.length) {
			if (arr[j] < min) {
				min = arr[j];
				k = j;
			}
			j++;
		}
		return k;
	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int mini = min_form_ith_index(arr, i);
			int temp = arr[i];
			arr[i] = arr[mini];
			arr[mini] = temp;
		}
	}
}
