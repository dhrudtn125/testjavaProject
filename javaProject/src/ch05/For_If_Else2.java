package ch05;

public class For_If_Else2 {
	public static void main(String[]args) {
		int sum=1;
		for(int i=1;i<=4;i++) {
			sum *=i;
			System.out.print(i);
			if(i==4) {
				System.out.print("=");
			}else {
				System.out.print("x");
			}
         }
		
		System.out.println(sum);
	}

}
