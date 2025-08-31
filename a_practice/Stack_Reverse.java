package a_practice;
import java.util.Stack;
public class Stack_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.push(70);
		
		System.out.println(st);
		//InsertatLast(st,6);
		Reverse(st);
		System.out.println(st);
	}
	
	public static void InsertatLast(Stack<Integer> st, int item) {
		if(st.isEmpty()) {
			st.push(item);
			return;
		}
		int x = st.pop();
		InsertatLast(st,item);
		st.push(x);
	}
	
	public static void Reverse(Stack<Integer> st) {
		if(st.isEmpty()) {
			return;
		}
		int x = st.pop();
		Reverse(st);
		InsertatLast(st,x);
	}

}
