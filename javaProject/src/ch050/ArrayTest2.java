package ch050;

public class ArrayTest2 
{
	public static void main(String[]args)
	{
		int sum=0;
		float average =0f;//평균을 저장하기 위해
		int[] score= {100,88,100,100,90};
		for(int i=0;i<score.length;i++)
		{
			sum +=score[i]; // sum=sum+score
		}
		average = sum/(float)score.length;//계산결과를 float값으로 얻기 위함
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+average);
	}

}
