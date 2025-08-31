package a_leetcode;
import java.util.*;
public class Letter_Combinations {

	static String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "23";
		List<String> ll = new ArrayList<>();
		Combination(ques, "",ll);
		System.out.println(ll);
	}
	
	public static void Combination(String ques, String ans,List<String> ll) {
		if(ques.length()==0) {
			//System.out.println(ans);
			ll.add(ans);
			return;
		}
		char ch = ques.charAt(0);
		String press = map[ch-48];
		for(int i=0;i<press.length();i++) {
			String s = ques.substring(1);
			Combination(s, ans+press.charAt(i),ll);
		}
	}

}
