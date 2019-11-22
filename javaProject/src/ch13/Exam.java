package ch13;

public class Exam {
	public static void main(String[] args) {
		String a= "Hello";
		String b = "Hello";
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println("=========================");
		String c = new String("Hello");
		String d = new String("Hello");
		System.out.println(c==d);  //주소값이 같냐?
		System.out.println(c.equals(d));  //내용이 같냐?
		
	}

}
