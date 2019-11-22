package ch13;

import java.util.Calendar;
import java.util.Date;

public class Cal {
	public static void main(String[] args) {
		//캘린더 인스턴스 생성은 new로 만들 수 없음
		Calendar cal = Calendar.getInstance();  //추상클래스의 static 메소드임
		
		System.out.print(cal.get(Calendar.YEAR)+"년");
		System.out.print("\t"+(cal.get(Calendar.MONTH)+1)+"월");  //월은 0~11로 처리됨 항상 +1을 해야함
		System.out.print("\t"+cal.get(Calendar.DATE)+"일");
		System.out.print("\t"+cal.get(Calendar.HOUR)+"시");
		System.out.print("\t"+cal.get(Calendar.MINUTE)+"분");
		System.out.print("\t"+cal.get(Calendar.SECOND)+"초");
		System.out.print("\t"+cal.get(Calendar.AM_PM));
		if(cal.get(Calendar.AM_PM)==0){
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		//요일(일요일 1 ~ 토요일 7) - Java에서는 숫자코드까지만 제공
		String yoil ="";
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:yoil = "일요일";break;
		case 2:yoil = "월요일";break;
		case 3:yoil = "화요일";break;
		case 4:yoil = "수요일";break;
		case 5:yoil = "목요일";break;
		case 6:yoil = "금요일";break;
		case 7:yoil = "토요일";break;
		}
		System.out.println("오늘은 "+yoil+"입니다.");
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
		//일년중에 몇번째 주인가?
		Date date = cal.getTime();
		System.out.println(date.getYear()+1900);
		//deprecated된 메소드 ex)getTear() - 더이상 쓰지 않는게 좋다.
		System.out.println(date.getMonth()+1);
		System.out.println(date.getDate());
	}

}
