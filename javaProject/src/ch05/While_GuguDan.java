package ch05;

public class While_GuguDan {

	public static void main(String[] args) {
		int dan = 2;
		int j=1;
		while(dan<=9) {
			System.out.println("** "+dan+"단 **");
			while(j<=9) {
				System.out.println(dan+" x "+j+" = "+dan*j);
				j++;
			}  //inner while
			j=1;  //j를 1로 초기화를 시켜주지 않으면 2단연산 이후에 
			// while 문이 돌아가지 않는다.
			dan++;
		}  //outer while

	}

}
