package a_practice;

public class Tower_of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		toh(n, "A", "B", "C");
		
	}
	
	public static void toh(int n,String src,String helper,String dest) {
		if(n==1) {
			System.out.println("transer disk " + n + " from " + src + " to " + dest);
			return;
		}
		toh(n-1,src,dest,helper);
		System.out.println("transer disk " + n + " from " + src + " to " + dest);
		toh(n-1,helper,src,dest);
	}

}
