package a_leetcode;

import java.util.Stack;

public class Asteroid_Collision {

	public static void main(String[] args) {
		int[] asteroids = { 5, 10, -5 };
		// System.out.println(asteroidCollision(asteroids));
		int[] ans = asteroidCollision(asteroids);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]);
		}
	}

	public static int[] asteroidCollision(int[] asteroids) {
		Stack<Integer> st = new Stack<>();
		for (int a : asteroids) {
			while (!st.isEmpty() && a < 0 && st.peek() > 0) {
				if (-a > st.peek()) {
					st.pop();
					continue;
				} else if (-a == st.peek()) {
					st.pop();
				}
				a = 0;
				break;
			}
			if (a != 0) {
				st.push(a);
			}
		}
		int[] ans = new int[st.size()];
		for (int i = st.size() - 1; i >= 0; i--) {
			ans[i] = st.pop();
		}
		return ans;

	}

}
