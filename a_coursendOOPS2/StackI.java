package a_coursendOOPS2;

// ye teeno files use kari hai
// Dynamic_StackI
// DSAI
// StackI
// Interface_Client

// C
public interface StackI {

	// In an interface we can not give body to any method

	public void fun();
	
	public void push(int item);

	public int pop();

	public int peek();

	// both mean the same
	// int x = 5;
	public static final int x = 10;

	// java 8 ka feature
	// agar method ke aage 'static' lagado to hum body de sakte hai
	static void f() {

	}

	// java 9 ka feature
	// isse pehle hum private method ko body nahi de sakte the
	private void f1() {

	}
}
