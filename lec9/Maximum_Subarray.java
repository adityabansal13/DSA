package lec9;

public class Maximum_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(MaximumSum(arr));
	}
	public static int MaximumSum(int[] nums) {
        int ans = Integer.MIN_VALUE;;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum = sum + nums[j];
                ans = Math.max(sum,ans);
            }
        }
        return ans;
    }

}
