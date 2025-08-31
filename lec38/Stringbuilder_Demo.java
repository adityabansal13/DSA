package lec38;

public class Stringbuilder_Demo {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("coding");
		System.out.println(sb1.capacity()); //ab 16+6 = 22 
		
		
		StringBuilder sb = new StringBuilder(); // capacity 16
		System.out.println(sb.capacity());
		sb.append("jghghgjhjgh");
		sb.append('a');
		//sb.append(true);
		sb.append(1011);
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		String s = sb.toString(); //builder to String
		StringBuilder sb2 = new StringBuilder(s); //String to builder
	}

}
