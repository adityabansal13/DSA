package lec20;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 687;
		IsPrime(n);
	}
	
	public static boolean IsPrime(int n) {
		int div = 2;
		while(div*div <= n) {
			if(n%div == 0) {
				return false;
			}
			div++;
		}
		return true;
	}
	
	public static int count(int n) {
		int c = 0;
		for(int i=2;i<n;i++) {
			if(IsPrime(i)) {
				c++;
			}
		}
		return c;
	}

}
