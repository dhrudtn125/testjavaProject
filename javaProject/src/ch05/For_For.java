package ch05;

public class For_For {
	public static void main(String[]args) {
		for(int i=1;i<=5;i++) {
			for(int j=1; j<=10;j++) {
				System.out.print("*");
				
			}//end inner for문
			System.out.println();
		}//end outer for문
	}//end main()

}