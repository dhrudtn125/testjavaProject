package pr;

import java.util.Scanner;

public class Moon2Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Moon2 m2= new Moon2();
		
		if(m2.month==2) {
		m2.getTwo();
		}else {
			m2.getDay();
			}
		m2.print();

	}

}
