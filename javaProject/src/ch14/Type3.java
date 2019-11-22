package ch14;

public class Type3 <T>{
	public T value;
	public void set(T value) {
		this.value=value;
	}
	public T get() {
		return value;
	}
	public static void main(String[] args) {
		Type3<String> a = new Type3<String>();
		a.set("kim");
		System.out.println(a.get());
		Type3<Integer> b = new Type3<Integer>();
		b.set(10);
		System.out.println(b.get());
		Type3<Double> c = new Type3<Double>();
		c.set(100.5);
		System.out.println(c.get());
	}

}
