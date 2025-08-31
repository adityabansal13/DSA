package a_coursend;

import java.util.Scanner;

public class Greeting_Problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		//String time = "05:30 AM";

		String[] s = time.split(" "); // 05:30 AM
		String t = s[0]; // 05:30
		String meridian = s[1]; // AM

		String[] a = t.split(":"); // 05 30
		int hour = Integer.parseInt(a[0]); // 05
		int min = Integer.parseInt(a[1]); // 30

		if (meridian.equals("PM")) {
			hour += 12;
		} else if (hour == 12 && meridian.equals("AM")) {
			hour = 0;
		}

		if (hour >= 5 && hour < 12) {
			System.out.println("good morning");
		} else if (hour >= 12 && hour < 16) {
			System.out.println("good afternoon");
		} else if (hour >= 16 && hour < 20) {
			System.out.println("good evening");
		} else if (hour >= 20 || hour < 5){
			System.out.println("good night");
		}
	}

}
