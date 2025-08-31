package lec7;

public class Maximum_Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,6,2,4,16,7,8,9};
		System.out.println(Max_Value(arr));
	}
	public static int Max_Value(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length-1;i++) {
			max = Math.max(max, arr[i]);
		}
		return max;
	}

}
