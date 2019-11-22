package ch11;

public class MyCalculatorExam {
	public static void main(String[] args) {
		Calculator cal = new MyCalculator();
		int value1 = cal.multiple(5, 3);
		int value2 = cal.plus(5, 3);
		int value3 = cal.exec(5, 3);
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
