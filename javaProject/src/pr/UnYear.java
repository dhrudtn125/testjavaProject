package pr;

import java.util.Scanner;

public class UnYear {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	int year,month,days;
	
	System.out.print("알고싶은 년도를 입력하시오 : ");
	year = input.nextInt();
	System.out.print("알고 싶은 월을 입력하시오 : ");
	month = input.nextInt();
	if( year %4 ==0) {
		
		
		switch(month) {
		
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 29;
		    break;
		default:
			days = 31;}
		System.out.print(year+"년 " +month +"월의 일수는 "+ days + "일 입니다.");}
	else {
		
		
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
			days = 31;}
		System.out.print(year+"년 "+month + "월의 일수는 "+days +"일 입니다.");}
		}	
	}