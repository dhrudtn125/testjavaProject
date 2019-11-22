package ch06;

public class DallStackTest {
	public static void main(String[] args) {

		fistMathod();  //fist호출

	}  //end main()

	private static void fistMathod() {  //fist시작
		secondMethod();  //second호출
		
	}  //end first

	private static void secondMethod() {  //second시작
		System.out.println("secondMethod()");
		
	}  //end second

}
