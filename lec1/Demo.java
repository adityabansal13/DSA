package lec1;

public class Demo {

	public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] a = twoSum(arr,target);
        System.out.println("Index 1: " + a[0]);
        System.out.println("Index 2: " + a[1]);
		}
	
		public static int[] twoSum(int[] arr, int target){
			for(int i=0; i<arr.length; i++){
				for(int j=0; j<arr.length; j++){
					if(j<i || j==i) continue;
					if(arr[i] + arr[j] == target){
						//System.out.printf("index: [%d],[%d]",i,j);
						return new int[] {i,j};
					}
				}
			}
			return arr;   
		}
}

