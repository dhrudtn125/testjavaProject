package ch13;

public class WrapperEx {
	public static void main(String[] args) {
		//Character사용
		System.out.println(Character.toLowerCase('A'));
		
		char c1 = '4', c2 = 'f';
		if(Character.isDigit(c1))
			System.out.println(c1+"=숫자");
		if(Character.isAlphabetic(c2))
			System.out.println(c2+"=영문자");
		//Integer 사용 
		System.out.println(Integer.parseInt("200"));
		//문자열 "200"을 10진수로 변환
		System.out.println(Integer.toString(200));
		//정수 200을 문자열 200으로 변환
		System.out.println(Integer.toBinaryString(200));
		//정수 200을 2진수문자열로 변환
		
		Integer i = new Integer(200);
		System.out.println(i.doubleValue());
		//정수를 double 값으로 변환 (unboxing)
		Double d = new Double(3.14);
		System.out.println(d.toString());
		
		boolean b = (4>3);
		System.out.println(Boolean.toString(b));
		//boolean형 true를 문자열 "true"로 변환
		System.out.println(Boolean.parseBoolean("false"));
		//문자열 "false"를 boolean형 false로 변환
	}

}
