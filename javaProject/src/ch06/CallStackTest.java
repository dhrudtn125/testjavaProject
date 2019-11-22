package ch06;

public class CallStackTest {

	public static void main(String[] args) {
		System.out.println("main(String[]args)가 시작 되었음");
	    firstMathod();
	    System.out.println("main(String[]args)가 끝났음");

	}

	private static void firstMathod() {
		System.out.println("firstMAthod()가 시작 되었음");
		secondMathod();
		System.out.println("firstMathod()가 끝났음");
	}

	private static void secondMathod() {
		System.out.println("secondMathod()이 시작 되었음");
		System.out.println("secondMathod()가 끝났음");
		
	}

}
