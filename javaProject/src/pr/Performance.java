package pr;

import java.util.Scanner;

public class Performance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int goal = 1000;
		int mySales;
		int bonus;
		String result;
		
		System.out.print("실적을 입력하세요 (단위: 만원)");
		mySales = input.nextInt();
		if(mySales >= goal) {
			result = "축하합니다.";
			bonus = (mySales - goal)/10;
			System.out.println(result+"\n"+bonus+"만원 입니다.");}
		else {
			result ="조금더 분발하세요... 실적이 그게 뭡니까.";
			System.out.println(result);}
			
		
		}
		
	

}
