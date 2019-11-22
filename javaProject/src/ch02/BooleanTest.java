package ch02;

public class BooleanTest {

	public static void main(String[] args) {
		boolean b;
		b = true;
		System.out.println("b : " + b );
		b = (1>2);// 순차적으로 읽기 때문에 이구간에서 b의 값이 다시 초기화(할당)됨
		System.out.println("b : " + b );
		
	

	}

}
