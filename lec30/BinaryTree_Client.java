package lec30;

public class BinaryTree_Client {

	public static void main(String[] args) {
		//10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
		Binary_Tree bt = new Binary_Tree();
		bt.Display();
		//System.out.println(bt.max());
		bt.INOrder();
	}

}
