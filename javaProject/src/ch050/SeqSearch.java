package ch050;

import java.util.Scanner;

public class SeqSearch {

	public static void main(String[] args) {
		int s[]= {0,10,20,30,40,50,60,70,80,90,100};
		int value,index=-1;
		Scanner scan = new Scanner(System.in);
		System.out.println("(보기 : 0 10 20 30 40 50 60 70 80 90 100)");
		System.out.print("위 숫자중 탐색 할 값을 입력하시오 : ");
		value=scan.nextInt();
		for(int i=0; i<s.length;i++) {
			if(s[i]==value)//사용자가 입력한 숫자와 for문을 돌며 순차적인덱스에 있는 값과 비교하여 같으면 아래 실행
				index = i;
		}
		if(index<s.length && index>=0)//true && true => true
			System.out.println(""+ value+" 값은 index"+index+" 의 위치에 있습니다");
		scan.close();
	}

}
