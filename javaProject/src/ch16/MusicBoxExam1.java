package ch16;

public class MusicBoxExam1 {
	public static void main(String[] args) {
		MusicBox box = new MusicBox();//객체 생성
		MusicPlay kim = new MusicPlay(1,box);
		MusicPlay lee = new MusicPlay(2,box);
		MusicPlay oh = new MusicPlay(3,box);
		
		kim.start();
		lee.start();
		oh.start();
		
	}

}
