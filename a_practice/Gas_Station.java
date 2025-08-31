package a_practice;

public class Gas_Station {

	public static void main(String[] args) {
		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 3, 4, 5, 1, 2 };
//		System.out.println(ans(gas, cost, 3));
//		double[] arr = new double[gas.length];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = 1.0*gas[i]/cost[i];
//		}
//		Arrays.sort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		System.out.println(index(gas, cost));

	}

	public static int index(int[] gas, int[] cost) {
		double[] arr = new double[gas.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1.0*gas[i]/cost[i];
		}
		//Arrays.sort(arr);
		double max = 0;
		int idx = -1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				idx = i;
			}
			max = Math.max(max, arr[i]);
		}
		if (idx == -1) {
			return -1; 
		}
		if(ans(gas, cost, idx)) {
			return idx;
		}
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[idx] == arr[i]) {
//				if(ans(gas, cost, i)) {
//					return i;
//				}
//			}
//		}
		
		return -1;
	}

	public static boolean ans(int[] gas, int[] cost, int idx) {
		int n = gas.length;
		int money = 0;	
		int tank = gas[idx];
		for (int i = idx; i < n + idx; i++) {
			if(tank - cost[i%n] <0) {
				return false;
			}
			tank = (tank - cost[i%n])+ gas[(i+1) % n];
		}
		if(tank>0) {
			return true;
		}
		else {
			return false;
		}
	}
}
