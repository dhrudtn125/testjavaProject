package ch07;

public class Address {
	String name;
	int age;
	String num;
	void print() {
		System.out.println("=======================");
		System.out.println("이름: "+name+"\n"+"나이: "+age+"\n"+"전화번호: "+num);
		System.out.println("=======================");
	}
	
	int getAge() {
		return age;		
	}
	void setAge(int j) {
		age=j;
	}

}
