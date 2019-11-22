package ch10;

public class FinalVar {
	final static int MAX_NUM = 500;
	//final변수는 전역변수라하여도 값이 초기화 되어야 함	,final처리된 변수는 상수화 되어 변경이 불가함
	public static void main(String[] args) {
		int max = 100;
		System.out.println(max);
		System.out.println(MAX_NUM);
	}

}
