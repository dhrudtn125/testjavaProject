package ch05;

public class Break2 {

	public static void main(String[] args) {
		int i=1;
		while(i<10) {  //1~9까지 반복수행
			if(i==5)
				break;  //i가 5일때 반복문을 빠져나감
			System.out.println("i="+i);
			i++;
		}  //end while
		System.out.println("++ 반복문 종료 ++");

	}  //end main

}