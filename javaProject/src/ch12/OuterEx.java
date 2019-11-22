package ch12;

class Outer2{
	class InnerNum{
		int num = 1; 
	}
	static class StaticName{
		static String name = "홍길동";
		
	}
	public void email() {
		class LocalEmail{
			String email = "hong@gmail.com";
			public void print() {
				System.out.println("이메일: "+email);
			}
		}
		LocalEmail em = new LocalEmail();
		em.print();
	}
}

public class OuterEx {
	public static void main(String[] args) {
		
		Outer2 ot = new Outer2();
		Outer2.InnerNum in = ot.new InnerNum();
		//Outer.StaticName st = new Outer.StaticName();// non static 멤버를 불러올때 사용
		System.out.println("---------------------------------------");
		System.out.println("고객번호: "+in.num);
		System.out.println("이름: "+Outer2.StaticName.name);
		ot.email();
		System.out.println("---------------------------------------");
		
	}

}
