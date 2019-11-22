package ch05;

public class Break {

	public static void main(String[] args) {
		int i=1;
		// break : switch,for,while,do while 등에서 모두 사용됨
		while(true) { // 무한반목
			System.out.println(i++);
			if(i>10)
				break;  //반복종료
		}
		System.out.println("프로그램 종료");
		
	}

}
