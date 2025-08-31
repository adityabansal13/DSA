package a_leetcode;

public class nextPermutation {

	public static void main(String[] args) {
		int[] arr = { 3,2,1 };
		//reverse(arr, 0, 2);
		// swap(arr,0,);
		Permutation(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Permutation(int[] arr) {
		int p = -1;
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				p = i;
				break;
			}
		}
		if(p==-1) {
			reverse(arr,0,arr.length-1);
			return;
		}
		int q = -1;
		for (int i = arr.length - 1; i > p; i--) {
			if(arr[i]>arr[p]) {
				q = i;
				break;
			}
		}
		swap(arr,p,q);
		reverse(arr,p+1,arr.length-1);
		
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void reverse(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
