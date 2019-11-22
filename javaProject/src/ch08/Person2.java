package ch08;

public class Person2 {
	private String name;
	private int age;
	private String address;
	private String phnum;
	
	public Person2() {
		this("오경수",25,"서울 서대문구","010-2462-3441");
	}
	public Person2(String name) {
		this(name,25,"서울 서대문구","010-2462-3441");
	}
	public Person2(String name,int age) {
		this(name,age,"서울 서대문구","010-2462-3441");
	}
	public Person2(String name, int age,String address) {
		this(name,age,address,"010-2462-3441");
	}
	public Person2(String name, int age, String address, String phnum) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phnum = phnum;
	}
	public void showInfo() {
		System.out.println("==신상정보==");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("주소: "+address);
		System.out.println("전화번호: "+phnum);
		
	}
	

}
