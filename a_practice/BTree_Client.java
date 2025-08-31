package a_practice;

public class BTree_Client {

	public static void main(String[] args) {
		// 10 true 20 true 40 false false true 70 true 80 false false false true 30 false true 60 false false
		BinaryTree bt = new BinaryTree();
		bt.Display();
		System.out.println("Max element = " + bt.max());
		System.out.println("Element found? = " + bt.find(70));
		System.out.println("Tree height = " + bt.ht());
		bt.PreOrder();
		bt.InOrder();
		bt.PostOrder();
		bt.LevelOrder();
	}

}
