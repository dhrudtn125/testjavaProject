package ch16;

public class CinemaBoxExam {
	public static void main(String[] args) {
		CinemaBox c1 = new CinemaBox();
		CinemaPlayer lee = new CinemaPlayer(1,c1);
		CinemaPlayer oh = new CinemaPlayer(2,c1);
		
		lee.start();
		oh.start();
	}
	

}
