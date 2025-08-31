package a_leetcode;

import java.util.Arrays;

public class Range_Sum_of_Sorted_Subarray_Sums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		int n = nums.length;
		int left = 1;
		int right = 5;
		System.out.println(rangeSum(nums,n,left,right));
	}
	public static int rangeSum(int[] nums, int n, int left, int right) {
        int l = (n*(n+1))/2;
        int[] arr = new int[l];
        int k = 0;
        int i = 0;
        while(i<n) {
        	int sum = 0;
        	int j = i;
        	while(j<n) {
        		sum += nums[j];
        		arr[k] = sum;
        		j++;
        		k++;
        	}
        	i++;
        }
        Arrays.sort(arr);
        int subsum = 0;
        for(int a = left-1; a<right; a++) {
        	subsum += arr[a];
        }
        return subsum;
//        return (arr.length);
    }
}
