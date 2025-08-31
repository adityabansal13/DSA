package lec35;

public final class Laptop {  //can not be inherited bcoz of final keyword
	int no_of_port; 
	
	public Mouse isMouse() {
		return new Wired_Mouse();
		
	}
}
