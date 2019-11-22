package ch07;

import java.util.Scanner;

public class AuctionUse {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		Auction a1 = new Auction();
		String user;
		String id;
		int don;
		System.out.print("이름을 입력하세요: ");
		user = scan.next();
	    System.out.print("아이디를 입력하세요: ");
	    id = scan.next();
	    System.out.print("구매금액을 입력하세요: ");
	    don = scan.nextInt();
	    scan.close();
		a1.input(user,id ,don );
		a1.calc();
		a1.print();
	}

}
