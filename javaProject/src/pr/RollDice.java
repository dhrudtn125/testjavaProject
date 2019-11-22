package pr;

public class RollDice {

	public static void main(String[] args) {
		 final int SIZE=6;
		 int freq[] = new int[SIZE];
		 
		 for(int i=0;i<100000;i++) {  //100000만큼 반복
			 ++freq[(int) (Math.random()*SIZE)];}
		 System.out.println("=====================");
		 System.out.println("면    빈도");
		 System.out.println("=====================");
		 
		 for(int i=0;i<SIZE;i++){
			 System.out.println(""+(i+1)+"  "+freq[i]);
		 }
			 
		 }

	}


