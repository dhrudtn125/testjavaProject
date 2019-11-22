package ch16;

public class MusicPlay extends Thread{
	int type;
	MusicBox musicBox;
	
	public MusicPlay(int type, MusicBox musicBox) {
		this.type=type;
		this.musicBox = musicBox;
	}
	
	@Override
	public void run() {
		//type이 무엇이냐에 따라 다른뮤직박스 호출
		switch(type) {
		case 1 : musicBox.playMusicA(); break;
		case 2 : musicBox.playMusicB(); break;
		case 3 : musicBox.playMusicC(); break;
		}
	}
	
	
}
