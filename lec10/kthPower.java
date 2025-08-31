package lec10;

public class kthPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 148;
		int k = 3;
		for(int i = 0;i<Integer.MAX_VALUE;i++) {
			int power = (int)Math.pow(i, k);
			if(power >n) {
				System.out.println(i-1);
				break;
			}
			
		}
	}

}
