package pr;

import java.util.Scanner;

public class TheaterReserve {

	public static void main(String[] args) {
		final int size=10;
		int[] seat =new int[size];  // seat 배열은 size의 값의 행을 갖는다 10이라면 10행이 되는 것
		
		while(true) {  //무한반복
			System.out.println("========================================");
			for(int i=0;i<size;i++)
				System.out.print(i+1+"  ");  //좌석번호 
			System.out.println("\n========================================");  //print 에서 한칸 내려쓰기 위에 \n을 사용 
			for(int i=0;i<size;i++)
				System.out.print(seat[i]+"  ");  //좌석 예약 상태
			System.out.println("\n========================================");  //위의 주석과 같은 내용
			
			System.out.println("원하시는 좌석을 입력하세요(종료는 -1): ");
			Scanner scan = new Scanner(System.in);
			int s =scan.nextInt();
			if(s==-1)//-1를 입력시 종료
				break;
			if(seat[s-1] ==0) {  //seat배열이 0부터 시작이니 s에 5값을 입력할경우 seat[4]의값을 계산 하여 0과 같을 경우
				seat[s-1] = 1;  //위의 경우에 seat[s-1]의 자리에 표시되는 숫자를 0에서 1로 변경한다 
				System.out.println("예약되었습니다.\n");  //1로 변경이 완료된 자리는 예약이 된것으로 한다
			}
			else {
				System.out.println("이미 예약된 자리입니다.\n");  //seat[s-1]값이 1일 경우 (0이 아닐경우)는 이미 예약된것으로 판단한다.
			}
			}
			
			}
		}




