package ch12;

public class InnerEx5 {
	public static void main(String[] args) {
		int num = 1;
		String name = "홍길동";
		String email = "hong@gmail.com";
		InnerEx3 in = new InnerEx3() {

			@Override
			public void num() {
				System.out.println("고객번호: "+num);
				
			}

			@Override
			public void name() {
				System.out.println("고객이름: "+name);
				
			}

			@Override
			public void email() {
				System.out.println("이메일: "+email);
				
			}
			
		};
		System.out.println("----------------------------");
		in.num();
		in.name();
		in.email();
		System.out.println("----------------------------");
	}

}
