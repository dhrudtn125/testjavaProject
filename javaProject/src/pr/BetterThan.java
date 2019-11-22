package pr;

import java.util.Scanner;

public class BetterThan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x,y;
		System.out.print("첫 번째 숫자를 입력하시오 : ");
		x = input.nextDouble();
		System.out.print("두 번째 숫자를 입력하시오 : ");
		y = input.nextDouble();
		if(x > y){		    
		    System.out.println(x +"이 더 높은 숫자 입니다.");}
		else if(x < y){
		    System.out.println(y +"이 더 높은 숫자 입니다.");}
		else{
			System.out.println("같은 숫자 입니다.");}
		
		    
		
	}

}
