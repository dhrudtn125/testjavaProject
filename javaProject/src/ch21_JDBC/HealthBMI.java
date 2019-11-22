package ch21_JDBC;

import java.util.Scanner;

public class HealthBMI {
	
	String getGrade(double bmi) {
		String grade ="";
		if(bmi<18.5) {
			grade = "저체중";
		}else if(bmi<23) {
			grade="정상";
		}else if(bmi>=25) {
			grade = "비만";
		}else if(bmi<25) {
			grade = "과체중";
		}
		return grade;
	}
	void print(HealthDTO dto) {
		System.out.println("이름 : "+dto.getNAME());
		System.out.println("나이 : "+dto.getAge());
		System.out.println("시장 : "+dto.getHeight());
		System.out.println("체중 : "+dto.getWeight());
		System.out.println("BMI : "+dto.getBmi());
		System.out.println("등급 : "+getGrade(dto.getBmi()));
		
	}
	public static void main(String[] args) {
		HealthBMI ex = new HealthBMI();
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디를 입력해라: ");
		String id = scan.next();
		HealthDAO dao = new HealthDAO();
		HealthDTO dto = dao.search(id);
		ex.print(dto);
		scan.close();
		
 	}

}
