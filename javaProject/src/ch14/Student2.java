package ch14;

public class Student2 {
	private String num;
	private String name;
	private String sub;
	private int score;
	public Student2() {
		
	}
	public Student2(String num, String name, String sub, int score) {
		this.num = num;
		this.name = name;
		this.sub = sub;
		this.score = score;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	

}
