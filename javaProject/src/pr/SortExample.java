package pr;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		final int size =10;  //상수를 초기화해 배열의 크기를 고정
		int[] num = new int[size];  //num이라는 배열을 생성후 크기를 size로 설정
		for(int i=0;i<size;i++) {  //size 의 수만큼 반복(난수를 배열에 추가하는 과정)
			int r =(int)(Math.random()*100);  //r이라는 난수를 생성
			num[i]=r;  //r이라는 난수를 num 이라는 배열에 [i]항에 추가 
		}
		System.out.println("최초의 리스트 : ");
		for(int r : num) {  //생성된 난수를 그대로 나열함
			System.out.print(r+"  ");
		}
		Arrays.sort(num);  //난수들이 초기화 되어있는 배열을 난수의 크기대로 정렬
		System.out.println("\n정렬된 리스트");
		for(int r : num) {  //정렬된 난수를 다시 나열
			System.out.print(r+"  ");
		}

	}

}
