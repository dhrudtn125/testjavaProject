package pr;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자열을 입력하시오 : ");
			str = scan.next();
			if(str.equals("quit")==true)
				break;
			if(str.matches("^www\\.(.+)")) {
				System.out.println(str+"은 www로 시작합니다.");
			}else {
				System.out.println(str+"은 www로 시작하지 않습니다.");
			}
		}
	}

}
