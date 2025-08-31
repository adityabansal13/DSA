package lec13;

public class String_Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "kunal";
		String s2 = "komal";
		System.out.println(s1.compareTo(s2)); //char ke num ka difference
		String s3 = "punam";
		String s4 = "puneet";
		System.out.println(s3.compareTo(s4)); //char ke num ka difference
		String s5 = "raj";
		String s6 = "rajesh";
		System.out.println(s5.compareTo(s6)); //len ke num ka difference
		
		System.out.println(compareTo(s1,s2));
	}
	
	
	public static int compareTo(String s1, String s2) {
		if(s1 == s2) {
			return 0;
		}
		int len = Math.min(s1.length(), s2.length());
		for(int i=0;i<len;i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				return s1.charAt(i)-s2.charAt(i);
			}
		}
		return s1.length()-s2.length();
	}

}
