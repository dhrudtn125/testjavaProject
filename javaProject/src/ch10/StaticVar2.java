package ch10;

public class StaticVar2 {
	static int total;  //클래스 메모리 영역에 생성 
	String model;  //heap영역에 생성
	public StaticVar2(String model) {
		this.model = model;
		total++;
	}

}
