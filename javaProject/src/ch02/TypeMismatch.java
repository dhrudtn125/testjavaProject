package ch02;

public class TypeMismatch {
	
	public static void main(String[] args) {
		byte n;
		// byte 타입의 변수에는 -128~127을 넘는 정수는 사용 불가능
		n = 127;
		
		System.out.println(n);
		
	}

}
