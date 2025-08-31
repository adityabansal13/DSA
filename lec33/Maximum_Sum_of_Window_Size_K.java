package lec33;

public class Maximum_Sum_of_Window_Size_K {

	public static void main(String[] args) {
		int[] arr = {2,3,5,6,7,1,4,5,6};
		int k = 3;
		System.out.println(Maximum_Sum(arr, k));

	}
	
	public static int Maximum_Sum(int[] arr, int k) {
		int sum = 0, ans=0;
		//1st window ka answer
		for(int i=0;i<k;i++) {
			sum += arr[i];
		}
		ans = sum;
		//2nd steps
		for(int i=k;i<arr.length;i++) {
			//window ko grow karna
			sum += arr[i];
			//window ko shrink karna
			sum -= arr[i-k];
			//ans update karna
			ans = Math.max(ans, sum);
		}
		return ans;
	}

}
