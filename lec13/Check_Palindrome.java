package lec13;

public class Check_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "naman";
		System.out.println(isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s) {
		int st = 0;
		int en = s.length()-1;
		while(st<en){
			if(s.charAt(st) != s.charAt(en)) {
				return false;
			}
			st++;
			en--;
		}
		return true;
	}

}
