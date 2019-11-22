package ch09;

public class Student {
	protected String name;
	protected String num;
	protected String major;
	protected int year;
	
	public Student() {
		//기본생성자
	}

	public Student(String name, String num, String major, int year) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}
	//상속관계의 클래스들에서는 생성자보다는 메소드를 잘 활용한다.
	public void input(String name, String num, String major, int year) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}
}
