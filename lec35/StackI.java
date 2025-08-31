package lec35;

public interface StackI {
	public void push(int item);

	public int pop();

	public static final int val = 90; // can never be changed bcoz of final keyword

	public boolean isempty();

	public static void hello() {
		
	}
	default void p() {
		
	}
	private static void hello1() {
		
	}
	
}
