package pr;

import java.util.Date;

public class Month {
	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth();
		System.out.println("현재 날짜는 " + month+"월");
		
		if(month < 3 )
			System.out.println("쌀쌀한 겨울이네요");
		else if(month < 6)
			System.out.println("기분좋은 봄이네요");
		else if(month < 9)
			System.out.println("뜨거운 여름이네요");
		else if(month < 11)
			System.out.println("선선한 가을이네요");
		else
			System.out.println("쌀쌀한 겨울이네요");
		
		
	}

}
