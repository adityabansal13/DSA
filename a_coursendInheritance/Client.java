package a_coursendInheritance;

public class Client {

	public static void main(String[] args) {
		P obj = new C();
		System.out.println(obj.d);
		System.out.println(obj.d2);
		System.out.println(((C) (obj)).d);
		System.out.println(((C) (obj)).d1);
		obj.fun();
		obj.fun2();
		((C) (obj)).fun1(); 
		
		
		//C obj = new C();
		

	}

}
