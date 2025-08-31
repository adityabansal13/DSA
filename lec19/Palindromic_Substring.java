package lec19;

public class Palindromic_Substring {

	public static void main(String[] args) {
		String str = "abc";
		System.out.println(Count_Palindrome(str));
	}

	public static int Count_Palindrome(String str) {
		int odd = 0;
		// odd length ke total palindromic substring count kr rahe hai
		for (int axis = 0; axis < str.length(); axis++) {
			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				if (str.charAt(axis - orbit) != str.charAt(axis + orbit)) {
					break;
				}
				odd++;
			}
		}
		// return odd;

		int even = 0;
		// even length ke total palindromic substring count kr rhe h
		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				if(str.charAt((int)(axis-orbit))!=str.charAt((int)(axis+orbit))){
					break;
				}
				even++;
			}
		}
		return even+odd;
	}

}
