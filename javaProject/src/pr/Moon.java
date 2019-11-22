package pr;

import java.util.Scanner;

public class Moon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month;
		int days;
		System.out.print("일수를 알고 싶은 월을 입력하세요 : ");
		month = input.nextInt();
		
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			break;
		default:
			days = 31;
		}
		System.out.println(month + "월은 "+ days+"일 입니다.");
	}

}
