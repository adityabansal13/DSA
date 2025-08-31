package a_blind45;

public class Trapping_Rain_Water {

	public static void main(String[] args) {
		int[] height = { 4, 2, 0, 3, 2, 5 };
		int[] maxl = new int[height.length];
		int[] maxr = new int[height.length];
		int[] min = new int[height.length];
		int sum = 0;
		int max = height[0];
		for (int i = 0; i < height.length; i++) {
			maxl[i] = Math.max(max, height[i]);
			max = maxl[i];
		}
		max = height[height.length - 1];
		for (int i = height.length - 1; i >= 0; i--) {
			maxr[i] = Math.max(max, height[i]);
			max = maxr[i];
		}
		
		for (int i = 0; i < min.length; i++) {
			min[i] = Math.min(maxl[i], maxr[i]);
			min[i] = min[i]-height[i];
			sum += min[i];
		}
		
//		for (int i = 0; i < height.length; i++) {
//			min[i] = min[i]-height[i];
//			sum += min[i];
//		}
		System.out.println(sum);
	}

}
