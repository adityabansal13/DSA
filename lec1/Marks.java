package lec1;
import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks: ");
		int marks = sc.nextInt();
		
		if(marks>=75) {
			System.out.println("A");
		}
		else if(marks>=65) {
			System.out.println("B");
		}
		else if(marks>=55) {
			System.out.println("C");
		}
		else if(marks>=45) {
			System.out.println("Pass");
		}
		else if(marks<45) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Enter correct marks");
		}
	}

}
