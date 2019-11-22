package ch10;

class Test11{
public void print() {
	System.out.println("test11");
}

class Test22 extends Test11{
	@Override
	public void print() {
		System.out.println("test22");
	}
}

public static class OverrideExam {
	public static void main(String[] args) {
		Test11 t= new Test11();
		t.print();
		
	}
}
}