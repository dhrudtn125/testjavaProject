package pr;
/**
 * 2019-09-09
 * 자습시간에 만듦
 * 스위치 첫 예습
 * 오경수 2019
 */
import java.util.Scanner;

public class Grade2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int kor,eng,mat,tot;
		int nin;
		double avg;  //정확한 값을 위해 실수형 변수 이용
		char grade;
		System.out.print("국어 : ");
		kor = input.nextInt();
		System.out.print("수학 : ");
		mat = input.nextInt();
		System.out.print("영어 : ");
		eng = input.nextInt();
		input.close();
		
		tot = kor + eng + mat;  //총점수
		avg = tot/3;  //평균점수
		nin = (int)avg/10;  // 10으로 나누어 소수점자리 탈락(변수가 int이기에 자동 소수점 탈락)
		System.out.println("총점수 : "+ tot);
		System.out.printf("평균점수 : "+"%.1f\n",avg);  //평균점수의 소수점 1번째 자리까지만 표시(\n을 사용해서 다음 print값을 한줄밑으로 내림)
		switch(nin) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
	        break;
		case 6:
			grade = 'D';
            break;
        default:
        	grade = 'F';
        	break;}
		System.out.println("성적은 "+grade + "입니다.");
		}
}