package ch06;

import java.util.Scanner;

public class Holiday {
	static int y;  //전역변수,멤버변수(클래스 전체에서 사용 할 수 있는 변수)
	
	static void input() {
		Scanner scan =new Scanner(System.in);
		System.out.println("근속년수를 입력하세요: ");
		y=scan.nextInt();
		scan.close();  //스캐너 사용메모리 정리
	}

    static int holiday(int year) {
    	int day=0;
    	if(year<=5) 
    		day=10;
    	else if(year <= 10) 
    		day=15;
    	else 
    		day=20;
    	
    	return day;
    	}
    public static void main(String[] args) {
    	input();
    	System.out.println("휴가일수 :"+holiday(y));
    }
    }
	
		

	


