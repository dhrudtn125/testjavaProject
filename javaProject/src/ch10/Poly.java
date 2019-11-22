package ch10;

class K{
	String name = "홍길동";
	public void print() {
		System.out.println("이름: "+name);
	}
}
class J extends V{
	static int age = 30;
	
	public void print() {
		System.out.println("나이: "+age);
	}
}
class V extends K{
	String num = "010-1234-5678";
	
	public void print() {
		System.out.println("전화번호: "+num);
	}
}

public class Poly {
	public static void main(String[] args) {
		V a=new V();		
		K b = new K();				
		J c = new J();
		System.out.println("-------------------------");
		b.print();
		c.print();
		a.print();
		System.out.println("-------------------------");
	}

}
