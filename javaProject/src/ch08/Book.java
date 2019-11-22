package ch08;

public class Book {  //도서판매정보 클래스
	private String bookname;
	private String author;
	private String press;
	private int year;
	private int price;
	private int amount;
	private int money;
	public Book() {
		this("자바","김철수","한빛",2016,20000,10);
	    System.out.println("기본생성자 호출");
			}
	public Book(String bookname, String author, String press,
			int year, int price, int amount) {
		this.bookname = bookname;
		this.author = author;
		this.press = press;
		this.year = year;
		this.price = price;
		this.amount = amount;
		money = price*amount;
	}
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println(bookname+"\t"+author+"\t"+press+"\t"+year+"\t"+price+"\t"+amount+"\t"+money);
	}
	
	

}
