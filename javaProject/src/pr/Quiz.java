package pr;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		final int goal =72;
		int an;
		int tries=0;
		do {
		System.out.print("0~100사이의 수를 맞춰보세요"+"\n"+"추측: ");
		an = scan.nextInt();
		tries++;
		if(an>goal) 
			System.out.println("\n"+"높습니다."+"\n");
		if(an<goal) 
			System.out.println("\n"+"낮습니다."+"\n");
		

		}while(an!=goal);
		System.out.println("정답입니다!"+"\n"+"시도 횟수:"+tries);
	}
}
