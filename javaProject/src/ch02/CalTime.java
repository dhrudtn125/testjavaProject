package ch02;

public class CalTime {
	public static void main(String[] args) {
		final double LIGHT_SPEED = 30e4;//빛의 속도 300000만 km/secs
		double distance = 40e12;//달까지 거리 약 40x10의12승 
		double secs;
		
		secs = distance/LIGHT_SPEED;
		
		double light_year = secs/(60.0*60.0*24.0*365.0);
		//secs/(초*분*시*일)
		System.out.println("지구에서 도달하는데 걸리는 시간은"+light_year+"광년 입니다.");
		
	}

}
