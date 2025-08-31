package a_blind45;

public class Gas_Station {

	public static void main(String[] args) {
		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 3, 4, 5, 1, 2 };
		System.out.println(index(gas, cost));
	}

	public static int index(int[] gas, int[] cost) {
		int total = 0, temp = 0, idx = 0;
		for (int i = 0; i < gas.length; i++) {
			int diff = gas[i] - cost[i];
			total += diff;
			temp += diff;
			if (temp < 0) {
				idx = i + 1;
				temp = 0;
			}
		}
		return total < 0 ? -1 : idx;
	}

}
