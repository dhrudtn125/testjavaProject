package ch08;

public class Member {
	private String name;
	private String userid;
	private int money;
	private String grade;
	// Ctrl +space => Constructor... ->생성자 자동코드 생성
	public Member() {
		System.out.println("기본 생성자 호출...");
		 
	}
	public Member(String name, String userid, int money) {
		System.out.println("매개변수가 있는 생성자 호출");
		this.name = name;
		this.userid = userid;
		this.money = money;
	}
	public void input(String name, String userid, int money) {
		this.name = name;
		this.userid = userid;
		this.money = money;
	}
	public String getGrade() {
		if(money>=100000)
			grade="Gold";
		else if(money>=50000)
			grade="Silver";
		else
			grade="Bronze";
		return grade;
	}
	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name+"\t"+userid+"\t"+money+"\t"+grade);
	}
	
		
	

}
