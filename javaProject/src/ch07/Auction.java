package ch07;

public class Auction {
	private String name;
	private String userid;
	private int money;
	private String grade;
	public void input(String name, String userid, int money) {
		this.name = name;
		this.userid = userid;
		this.money = money;
	}
	public void calc() {
		
		if(money >=100000)
			grade = "Gold";
		else if(money >=70000)
			grade = "Silver";
		else
			grade = "Bronze";}
	
	public void print() {
		System.out.println("============================");
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println("============================");
		System.out.println(name+"\t"+userid+"\t"+money+"\t"+grade);
	}
	
	
	

}
