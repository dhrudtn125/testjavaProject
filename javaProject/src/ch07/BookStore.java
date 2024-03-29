package ch07;

public class BookStore {
	private String bookName;  //책이름
    private String author;  //저자
    private String press;  //출판사
    private int year;  //출판 연도
    private int price;  //가격(단가)
    private int amount;  //판매수량
    private int money;  //판매금액(단가 x 판매 수량)
	
    public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getMoney() {
		money = price*amount;
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
    
    public void print() {
    	System.out.println("=======================================================");
    	System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
    	System.out.println("=======================================================");
    	System.out.println(bookName+"\t"+author+"\t"+press+"\t"+year+"\t"+price+"\t"+amount+"\t"+getMoney());
    	
    }
	

}
