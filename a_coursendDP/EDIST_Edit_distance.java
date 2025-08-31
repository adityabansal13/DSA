package a_coursendDP;

public class EDIST_Edit_distance {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

	}

	public static int editdistance(String s, String t, int i, int j) {

		if (i == s.length()) {

			return t.length() - j;

		}

		if (j == t.length()) {

			return s.length() - i;

		}

		int ans = 0;

		if (s.charAt(i) == t.charAt(j)) {

			ans = editdistance(s, t, i + 1, j + 1); //

		} else {

			int del = editdistance(s, t, i + 1, j);

			int ins = editdistance(s, t, i, j + 1);

			int rep = editdistance(s, t, i + 1, j + 1);

			ans = 1 + Math.min(del, Math.min(ins, rep));

		}

		return ans;

	}

}