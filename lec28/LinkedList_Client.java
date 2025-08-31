package lec28;

public class LinkedList_Client {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.Display();
		System.out.println(ll.getatIndex(0));
	}

}
