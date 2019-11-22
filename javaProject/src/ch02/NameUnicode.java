package ch02;

public class NameUnicode {

	public static void main(String[] args) {
		char last_name = '\uC624';
		char first_name = '\uACBD';
		char first_name2 = '\uC218';
		
		System.out.print(last_name+"\t");
		System.out.print(first_name+"\t");
		System.out.println(first_name2+"\t");
	    System.out.println("cha형 (\'\\uC624'): "+ last_name);
	    System.out.println("cha형 (\'\\uACBD'): "+ first_name);
	    System.out.println("cha형 (\'\\uC218'): "+ first_name2);
	}
}
