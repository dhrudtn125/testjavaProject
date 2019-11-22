package pr;

import java.util.Scanner;

public class Morning {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hour,minute;
		String result;
		System.out.print("현재 시간은? ");
		hour = input.nextInt();
		System.out.print("몇분 입니까? ");
		minute = input.nextInt();
		
		if(hour < 12) {
			result = "Good Morning";
					System.out.println(result);
		}else {
			
		}
			
	}

}
