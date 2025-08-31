package a_practice;

import java.util.*;

public class Generate_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<String> ll = new ArrayList<>();
		Paren(n, 0, 0, "", ll);
		System.out.println(ll);
	}

	public static void Paren(int n, int open, int close, String ans, List<String> ll) {
		if (open == n && close == n) {
			ll.add(ans);
			return;
		}
		if (open > n || close > open) {
			return;
		}
		Paren(n, open + 1, close, ans + "(", ll);
		Paren(n, open, close + 1, ans + ")", ll);
	}
}
