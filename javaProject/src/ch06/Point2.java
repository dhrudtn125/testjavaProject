package ch06;

public class Point2 {
	static String[] name = {"홍길동","이순신","김유신"};
	static int[] java = {80,89,90};
	static int[] db = {90,99,80};
	static int[] html = {80,88,70};
	static int[] jsp = {78,92,100};
	static int[] tot = {0,0,0};
	static int[] avg = {0,0,0};
	
	static void getTot() {
		for(int i=0;i<name.length;i++) {
			tot[i] = java[i]+db[i]+html[i]+jsp[i];
		}
	}
	static void getAvg() {
		for(int i=0;i<name.length;i++) {
			avg[i] = tot[i]/4;
		}
	}
	static void print() {
		System.out.println("---------------------------------------------------");
		System.out.println("이름\tJAVA\tDB\tHTML\tJSP\t총정\t평균");
		System.out.println("---------------------------------------------------");
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]+"\t"+java[i]+"\t"+db[i]+"\t"+html[i]
					+"\t"+jsp[i]+"\t"+tot[i]+"\t"+avg[i]);
		}
		System.out.println("---------------------------------------------------");
		
	}

	public static void main(String[] args) {
		getTot();
		getAvg();
		print();
		

	}

}
