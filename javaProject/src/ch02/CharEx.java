package ch02;

public class CharEx {
	public static void main(String[] args) {
		char aValue = '\u0041';
		System.out.println("char형('\u0042'): " +aValue);
		char bValue = '\u0041';
		System.out.println("char형(\'\\u0042'): "+bValue+"('\b')");
	}

}
