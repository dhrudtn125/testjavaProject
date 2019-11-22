package ch03;

import java.util.Scanner;

public class Jumsoo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int java,html,jsp,db,tot;
		double avg;
		System.out.print("이름 : ");
		name = input.next();
		System.out.print("Java점수 : ");
		java = input.nextInt();
		System.out.print("HTML점수 : ");
		html = input.nextInt();
		System.out.print("JSP점수 : ");
		jsp = input.nextInt();
		System.out.print("DB점수 : ");
		db = input.nextInt();
		
		tot = java + html +  jsp + db;
		avg = tot/4.0;
		System.out.println("이름\tJAVA\tHTML\tJSP\tDB\t총점\t평균");
		System.out.println(name+"\t"+java+"\t"+html+"\t"+jsp+"\t"+db+"\t"+tot+"\t"+avg);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%-4.1f",name,java,html,jsp,db,tot,avg);
	}

}
