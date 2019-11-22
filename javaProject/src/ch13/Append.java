package ch13;

public class Append {
	public static void main(String[] args) {
		String a = "Hello";  //불변
		a= a+" java";
		System.out.println(a);
		
		StringBuilder b = new StringBuilder("Hello");
		b.append(" java");
		System.out.println(b);
		
	}

}
