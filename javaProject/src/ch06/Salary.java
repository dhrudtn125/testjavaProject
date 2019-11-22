package ch06;

public class Salary {
	static String[] name = {"박과장","김과장","이대리","최주임","홍실장"};  //전역변수 멤버변수
	static int[] salary = {2800,3000,2500,2000,3500};  //연봉
	static int[] total = new int[5];
	static int[] bonus = {0,0,0,0,0};
	static int[] tax = new int[5];  //총액의 3%
	static int[] pay = new int[5];
	static int pay_tot;
	
	static void calc() {  //계산 method(보너스,총액,세금,실수령액)
		for(int i=0;i<name.length;i++) {
			bonus[i] = (int)(salary[i]*0.3); //형변환
			total[i] = salary[i]+bonus[i];
			tax[i] = (int)(total[i]*0.03);
			pay[i] = total[i]-tax[i];
			pay_tot +=pay[i];
		}  //end for
	}  //end calc
	static void print() {
		System.out.println("이름\t연봉\t보너스\t총액\t세금\t실수령액");
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]+"\t"+salary[i]+"\t"+bonus[i]+"\t"+total[i]+"\t"+tax[i]+"\t"+pay[i]);
		}
		System.out.println("실수령액 합계 : "+pay_tot);
		System.out.println("실수령액 평균 : "+pay_tot/5);
	}

	public static void main(String[] args) {
		calc();  //계산기능 메소드 호출
		print();
		

	}

}
