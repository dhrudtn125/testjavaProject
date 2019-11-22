package ch06;

public class ReturnDemo {

	public static void main(String[] args) {
		printScore(99);
		printScore(120);
	}

	private static void printScore(int score) {
		if(score <=0||score>=100) {
			System.out.println("잘못된 점수 : "+score);
			//return;  //void 에서 return은 종료를 의미함
		}
		System.out.println("점수 : "+score);
		
	}

}
