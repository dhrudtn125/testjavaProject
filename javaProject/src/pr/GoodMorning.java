package pr;

import java.util.Date;

public class GoodMorning {
	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		
		System.out.println("현재 시간은 "+date);
		if (hour < 11) {
			System.out.println("Good Morning");
		}else if(hour < 15) {
			System.out.println("Good Afternoon");
		}else if(hour < 20) {
			System.out.println("Good Evening");
		}else {
			System.out.println("Good Nigt");
		}
		
	}

}
