package ch07;

public class Point2 {
	private String name;
	private int java;
	private int db;
	private int html;
	private int jsp;
	private int tot;
	private double avg;
	private String grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getTot() {
		tot = java+db+html+jsp;
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		avg = tot/4.0;
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getGrade() {
		if(avg>=90)
			grade = "수";
		else if(avg>=80)
			grade = "우";
		else if(avg>=70)
			grade = "미";
		else if(avg>60)
			grade = "양";
		else
			grade = "가";
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void print() {
		System.out.println("==============================================================");
		System.out.println("이름\tJAVA\tDB\tHTML\tJSP\t총점\t평균\t등급");
		System.out.println("==============================================================");
		System.out.println(name+"\t"+java+"\t"+db+"\t"+html+"\t"+jsp+"\t"
		+getTot()+"\t"+String.format("%.2f", getAvg())+"\t"+getGrade());
	}
	

}
