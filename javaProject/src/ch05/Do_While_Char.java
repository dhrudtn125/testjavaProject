package ch05;

public class Do_While_Char {
	public static void main(String[]args) {
		char c = 'a';
		do {
			System.out.println(c);
			c=(char)(c+1);  //영문의경우 1을 더하면 다음문자의 코드값
		}while(c<='z');
	}

}
