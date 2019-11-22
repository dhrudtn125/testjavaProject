package pr;

import java.util.Scanner;

public class Moon2 {
	int year;
	int month;
	int day;
	Scanner scan = new Scanner(System.in);
	void getDay() {				
		other:
		while(true) {
			System.out.print("알고싶은 년도를 입력하세요: ");
			year=scan.nextInt();
			System.out.print("알고싶은 월을 입력하세요: ");
			month=scan.nextInt();
			if(1<=month&&12>=month) {
				switch(month) {
				case 4:
				case 6:
		        case 9:
		        case 11:
		        	day = 30;
		        	break other;
		        case 2:
		        	break other;
		        default :
		        	day = 31;
		        	break other;}
				}else {
					System.out.print("잘못된 입력입니다. 다시 입력하세요 :");
					break;
}
	}
      }
	void getTwo() {
			if(year%4==0) {
				day=29;	
			}else {
				day=28;				
			}			
		}		
	
	void print() {
		if(month==2) {
			System.out.println(year+"년의"+month+"월은 "+day+"입니다.");
		}else 
		    System.out.println(year+"년의"+month+"월은"+day+"입니다.");
	}
}