package lec9;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,7,8,9,11,5,87,65,69,13,57};
		//InsertLastElement(arr,arr.length-1);
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void InsertLastElement(int[] arr,int i) {
		int item=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>item) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=item;
	}
	public static void sort(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			InsertLastElement(arr,i);
		}
	}


}
