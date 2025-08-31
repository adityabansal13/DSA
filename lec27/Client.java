package lec27;

public class Client {

	public static void main(String[] args) {

		// Case 1
//		P obj = new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		obj.Fun();
//		obj.Fun1();

		// Case 2
//		P obj = new C();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		//System.out.println(obj.d2);  //can't access d2
//		System.out.println(((C)(obj)).d2);  //typecasting
//		System.out.println(((C)(obj)).d);  //typecasting
//		obj.Fun(); //method override hojaega(C ka call hoga)
//		obj.Fun1();
//		//obj.Fun2(); //can't access
//		((C)(obj)).Fun2();

		// Case 3
//		C obj = new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(obj.d2);

		// Case 4
		C obj = new C();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		System.out.println(((P) (obj)).d);
		obj.Fun();
		obj.Fun1();
		obj.Fun2();
	}

}
