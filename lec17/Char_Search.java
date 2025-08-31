package lec17;

public class Char_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcbvabavacf";
		
	}
	
	public static boolean isPresent(String str,char ch,int i) {
		for(;i<str.length();i++) {
			if(str.charAt(i) == ch) {
				return true;
			}
		}
		return false;
	}

}
