package a_coursendLinkedList;

public class LinkedList_Client {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.AddFirst(10);
		ll.AddFirst(20);
		ll.AddFirst(30);
		ll.AddLast(40);
		ll.AddAtIndex(-20, 2);
		ll.AddLast(42);
		ll.AddLast(67);
		ll.AddLast(90);
		ll.Display();
		
//		System.out.println(ll.getfirst());
//		System.out.println(ll.getlast());
//		System.out.println(ll.getindex(2));
		
//		System.out.println(ll.removefirst());
//		ll.Display(); 
//		System.out.println(ll.removelast());
//		ll.Display(); 
		System.out.println(ll.removeindex(2));
		ll.Display(); 
	}

}
