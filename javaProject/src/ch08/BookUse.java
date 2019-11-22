package ch08;

public class BookUse {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.print();
		
		Book b2 = new Book("HTML","김선생","영진",2017,30000,20);
		b2.print();
	}

}
