package ch21_JDBC;

import java.util.Scanner;

public class MemberDelete2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 아이디를 입력하세요: ");
		String userid = scan.next();
		scan.close();
		int rows = MemberDAO2.memberDelete(userid);
		if(rows>0) {
			System.out.println("삭제가 완료되었습니다.");
		}
	}

}
