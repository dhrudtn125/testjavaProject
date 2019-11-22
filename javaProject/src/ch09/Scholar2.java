package ch09;

public class Scholar2 extends Student2{
	private String grade;
	
	
	
	public void input(String name, String num, String major, int year,String grade) {
		super.input(name, num, major, year);
		this.grade = grade;
		
	}
	public void input(String name, String num) {
		this.name = name;
		this.num = num;
	}
	public void print() {
		System.out.println("이름\t학번\t\t전공\t학년\t등급");
		System.out.println(name+"\t"+num+"\t"+major+"\t"+year+"\t"+grade);
		System.out.println("--------------------------------------------");
	}
	
	public void print2() {
		System.out.println("이름\t학번\t\t전공\t학년");
		
		System.out.println(name+"\t"+num+"\t"+major+"\t"+year);
		System.out.println("--------------------------------------------");	
	}
	
	public void print3() {
		System.out.println("이름\t학번");
		System.out.println(name+"\t"+num);
    }
}