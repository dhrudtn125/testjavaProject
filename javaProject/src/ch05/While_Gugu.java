package ch05;

import java.util.Scanner;

public class While_Gugu {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		int i=1;
		System.out.print("구구단에서 출력하고 싶은 단을 입력 하시오 : ");
		n = sc.nextInt();
		while(i<=9) {
			System.out.println(n+"x"+i+"="+n*i);
			i++;
			
			
		}

	}

}
