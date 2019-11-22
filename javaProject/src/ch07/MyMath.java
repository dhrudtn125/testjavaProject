package ch07;
  //오버로딩
public class MyMath {
	int square(int i) {  //정수값을 제곱
		return i*i;
	}
	double square(double i) {  // 실수값을 제곱
		return i*i;
	}
}
