package ch03;

public class Logicaloperator {
	public static void main(String[] args) {
		int i;
		double f;
		
		f = 5 / 4;//자동 형변환(작은값 ->큰값)
		System.out.println(f);
		
		f = (double)5 / 4;
		System.out.println(f);
		
		i = (int)1.3 + (int)1.8;//강제 형변환(큰값->작은값)
		System.out.println(i);
		
	}

}
