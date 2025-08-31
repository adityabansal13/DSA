package a_practice;

public class substringss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				String x = s.substring(i, j); 
				System.out.println(x);
			}
		}
	}

}
