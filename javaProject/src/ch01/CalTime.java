package ch01;

public class CalTime {

	public static void main(String[] args) {
		final double light_Speed = 30e4;
		double distance = 40e12;
		double secs;
		
		secs = distance/light_Speed;
		
		double light_Year = secs/(60.0*60.0*24.0*365.0);
		System.out.println("걸리는 시간은" + light_Year + "광년 입니다.");
		
		double secs2 = 60e3;
		double how_Long;
		
		how_Long = distance/(secs2/60.0*60.0*24.0*365.0);
		
		System.out.println("우주선이 도달하는데 걸리는 기간은" + how_Long + "년 입니다.");
		 // TODO Auto-generated method stub

	}

}
