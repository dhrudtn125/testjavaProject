package Test;
/**
 * 2019-09-16
 * 학번 : 2019
 * 이름 : 오경수
 */
import java.util.Scanner;

public class SmallProject {
	public static void main(String[]args) {
		int menu;
		Scanner scan = new Scanner(System.in);
			other :				
			    while(true) {  // 무한반복,라벨을 이용하여 break other;을 하기에 do while문보다 무한반복문을 사용
			    	System.out.println("== MENU ==");
			    	System.out.println("(1) 김치찌개 ");
			    	System.out.println("(2) 된장찌개");
			    	System.out.println("(3) 육개장");
			    	System.out.println("(4) 불고기");
			    	System.out.print("원하시는 메뉴(1~4)를 선택하세요(종료: 0) : ");  //메뉴이름도 같이 반복 되기를 원해서 while문에 추가,반복이 싫을경우 while문 위로 메뉴 옮기면 됨
			    	String tmp = scan.next();  //사용자가 문자형으로 입력
					menu = Integer.parseInt(tmp);  //문자형을 숫자형으로 변환
				    switch(menu) {
			            case 1:
			            	System.out.println("선택하신 메뉴는 1번 김치찌개 입니다."+"\n"+"종료");
			            	break other;  //1번 입력시 더 이상 반복 하지 않음
			            case 2:
			            	System.out.println("선택하신 메뉴는 2번 된장찌개 입니다."+"\n"+"종료");
			            	break other;  //2번 입력시 더 이상 반복 하지 않음
			            case 3:
			            	System.out.println("선택하신 메뉴는 3번 육개장 입니다."+"\n"+"종료");
			            	break other;  //3번 입력시 더 이상 반복 하지 않음
			            case 4:
			            	System.out.println("선택하신 메뉴는 4번 불고기 입니다."+"\n"+"종료");
			            	break other;  //4번 입력시 더 이상 반복 하지않음
			            case 0:
			            	System.out.println("프로그램을 종료합니다");
			            	 //0을 입력하면 프로그램 종료// exit(0)을 이용 
			            	System.exit(0);
			            	break;
			            default:
			            	System.out.println("메뉴를 잘못 선택 하셨습니다.(종료: 0)"+"\n");  //다른값을 입력할시 다시 while문 반복
			            	break;}  //end switch
				    }  //end while
		scan.close();
	}  //end main()		
	}


