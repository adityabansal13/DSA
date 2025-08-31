package lec15;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int n = 4;
		
		System.out.println(pow(a,n));
	}
	
	public static int pow(int a,int n) {
		if(n==1) {
			return a;
		}
		int p = pow(a,n-1);
		return a*p;
	}

}
