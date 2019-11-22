package ch13;

public class ExceptionEx {
	public static void main(String[] args) {
		int[] nums = {10,20,30,40,50};
		try {
			for(int i=0;i<=5;i++) {//i<=5 에러지만 문법적 오류는 아니다
				System.out.println(nums[i]);
				
			}
			
		} catch (Exception e) {
			System.out.println("프로그램 실행중에 에러가 발생되었습니다");
			
		
		}
		System.out.println("프로그램을 종료....");
		
		
	}

}
