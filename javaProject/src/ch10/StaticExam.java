package ch10;
  //공동된 값을 사용 할 때 => static ex)학점 4.0이상 3.5이상 등
  //개별적인 값을 사용 할 때 => non static ex)학생들, 과목 등
public class StaticExam {
	public static void main(String[] args) {
		//대표적으로 자주 사용하고 고정된 값 등, Math클래스등
		int a=40,b=30,result;
		result=Math.max(a, b);
		System.out.println(result);
		result=Math.min(a, b);
		System.out.println(result);
		System.out.println(Math.sqrt(100));
		double r=15.3;
		System.out.println("원의 둘레: "+2*Math.PI*r);
		System.out.println("원의 넓이: "+Math.PI*r*r);
	}

}
