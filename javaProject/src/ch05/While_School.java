package ch05;

import java.util.Scanner;

//사용자로부터 국,영,수 점수 입력받고 총점,평균 출력
public class While_School {
	public static void main(String[]args) {
		int count = 0;
		int sum =0;
		Scanner scan =new Scanner(System.in);
		System.out.println("국어,영어,수학 점수를 각각입력하고 "+"마지막에 -1을 입력하세요");
		int n = scan.nextInt();
		while(n !=-1) {
			sum += n;
			count++;
			n = scan.nextInt();
		}//end while
		
		if(count ==0)
			System.out.println("입력된 수가 없습니다.");
		else {
			System.out.printf("총점은 %d이고 평균은 %4.1f입니다.",sum,(double)sum/count);
		}//end else
		scan.close();
	}//end main()

}
