package lec6;

public class boston {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 378;
		bostonnum(n);

	}

	public static void bostonnum(int n) {
		int[] arr = new int[1000];
		int j = 2;
		int i = 0;
		while (j < n) {
			if (n % j == 0) {
				arr[i] = j;
				i++;
				n = n / j;
				i = 0;
			}
			else i++;
		}
		int sum = 0;
		for (int k = 0; k < arr.length; k++) {
			sum += arr[k];
			if (arr[k] == 0)
				break;
			System.out.println(sum);
		}
		
		// int b = 0;
		// if(sum>10){
		// while(sum>0){
		// b += sum%10;
		// sum = sum/10;
		// }
		// }
		// return b;
	}

}
