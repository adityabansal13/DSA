package a_leetcode;

public class Koko_Eating_Bananas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] piles = {3,6,7,11};
		int h = 8;
		System.out.println(minEatingSpeed(piles,h));
	}

	public static int minEatingSpeed(int[] piles, int h) {
		int s = 0;
		int e = piles.length-1; //11
		for (int i = 0; i < piles.length; i++) {
			e += piles[i];
		}
		int mid = (s + e) / 2; //5
		int ans = 0;
		//Arrays.sort(piles);
		while (s <= e) {
			if (isPossible(piles, h, mid) == true) {
				e = mid - 1;
			} else {
				s = mid + 1;
			}
			mid = (s + e) / 2;
			ans = mid;
		}
		return mid;
	}

	public static boolean isPossible(int[] piles, int h, int mid) {
		int count = 0;
		for (int i = 0; i < piles.length; i++) {
			if (mid < piles[i]) {
				while (piles[i] > 0) {
					piles[i] = piles[i] / mid;
					count++;
				}
			} else {
				count++;
			}
			if (count > h) {
				return false;
			}
		}
		return true;
	}
}
