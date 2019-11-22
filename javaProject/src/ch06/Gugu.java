package ch06;

public class Gugu {
     static void gugu(int dan) {
		System.out.println("==== "+dan+"단 ====");
		for(int i=1;i<=9;i++)
			System.out.println("   "+dan+"x"+i+"="+dan*i);
				
			}  //end gugu
     public static void main(String[]args) {  //메인은 코드가 적을수록 좋음
    	 gugu(3);
    	 
    	 for(int i=2;i<=9;i++) {
    		 gugu(i);
    	 }
     }
		
	}


