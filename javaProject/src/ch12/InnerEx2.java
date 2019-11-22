package ch12;

import java.util.Scanner;

class Outer3{
	static Scanner scan = new Scanner(System.in);
	private static int num;
	private String name;
	private String email;
	class Inner{
		public void print() {
			System.out.print("이름을 입력하세요: ");
			name = scan.next();
			
		}
	}
	static class StaticNum{
		public static void print() {
			System.out.print("고객번호를 입력하세요: ");
			num = scan.nextInt();
		}
	}
	public void print() {
		class LocalInner{
			public void print() {
			     System.out.println("이메일주소를 입력하세요: ");
		         email = scan.next();
		
			}
		}
		LocalInner li = new LocalInner();
		li.print();
		System.out.println("\n--------------------------------");
		System.out.println("고객번호: "+num);
		System.out.println("고객이름: "+name);
		System.out.println("이메일: "+email);
		}
}

public class InnerEx2 {
	public static void main(String[] args) {
		Outer3 oc = new Outer3();
		Outer3.Inner in = oc.new Inner();
		System.out.println("------------------------------"); 
		Outer3.StaticNum.print();
		in.print();
		oc.print();
	}
	

}

