package ch05;

public class Star {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}//end inner
			System.out.println();
		}//end outer
		//역삼각형 그리기
		for(int i=4; i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}//inner
			System.out.println();
		}//outer

	}//end main()

}
