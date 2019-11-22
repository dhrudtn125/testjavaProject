package ch050;

public class ArrayScore {

	public static void main(String[] args) {
		int[][] score = {{100,100,100},{20,20,20},{30,30,30},{40,40,40},{50,50,50}};
		// 과목별  총점
		int korTotal =0;
		int engTotal =0;
		int mathTotal=0;
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=============================================");
		for(int i=0;i<score.length;i++) {
			int sum=0;
			korTotal+=score[i][0];
			engTotal+=score[i][1];
			mathTotal+=score[i][2];
			System.out.printf("%3d\t",i+1);
			for(int j =0;j<score[i].length;j++) {
				sum+=score[i][j];
				System.out.printf("%5d",score[i][j]);
			}
			
			float avg = sum/(float)score[i].length;
			System.out.printf("%5d%\t5.1df%n\t",sum,avg);
					
		}
		System.out.println("=============================================");
		System.out.printf("총점 : 국어: %3d 영어: %3d 수학: %3d%n",korTotal,engTotal,mathTotal);
		

	}

}
