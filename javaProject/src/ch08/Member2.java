package ch08;

public class Member2 {
	private String name;
	private String id;
	private String stuff;
	private int price;
	private String grade;
	
	public Member2() {		
		System.out.println("기본생성자 호출...");
	}
	public Member2(String name, String id, String stuff, int price) {
		System.out.println("매게변수가 있는 생성자 호출...");
		this.name = name;
		this.id = id;
		this.stuff = stuff;
		this.price = price;
	}
	public Member2(String stuff,int price) {
		this("김철수","kims",stuff,price);
	}
	public void input(String name, String id, String stuff, int price) {	
		this.name = name;
		this.id = id;
		this.stuff = stuff;
		this.price = price;

	}
	public String getGrade() {
		if(price>1000000)
			grade = "Gold";
		else if(price>=100000)
			grade = "Silver"; 
		else
			grade = "Bronze";
		return grade;
	}
	public void print() {
		System.out.println("이름\t아이디\t상품명\t구매금액\t등급");
		System.out.println(name+"\t"+id+"\t"+stuff+"\t"+price+"\t"+grade);
		System.out.println("----------------------------------------------------");
	}
}


}
