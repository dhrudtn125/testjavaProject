package ch05;
//5행 5열
public class Matrix {
	public static void main(String[]args) {
		for(int i=1;i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.printf("[%d,%d]",i,j);
			}
			System.out.println();
		}
	}

}
