package ch16;

public class CinemaPlayer extends Thread{
	int type;
	CinemaBox cinema;
	
	public CinemaPlayer(int type, CinemaBox cinema) {
		this.type=type;
		this.cinema=cinema;	
	}
	@Override
	public void run() {
		switch(type) {
		case 1: cinema.playCinemaA(); break;
		case 2: cinema.playCinemaB(); break;
		}
	}

}
