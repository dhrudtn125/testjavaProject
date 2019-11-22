package ch15;

public class Test {
	public static void main(String[] args) {
		try {
			int num= Integer.parseInt("ABC");; //영문자를 숫자화 할수 없다.
			System.out.println(num);
			
		} catch (NumberFormatException e) {
			System.out.println("NumberFormat 예외발생");
		}
	}

}
