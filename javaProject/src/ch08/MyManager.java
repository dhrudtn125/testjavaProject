package ch08;

public class MyManager {
	private int score;
	
	private MyManager(int score) {  //싱글톤 처리
		this.score=score;
	}
	
	private static MyManager mgr;
	private static MyManager getInstance() {
		if(mgr==null)
			mgr=new MyManager(10);
		return mgr;
	}
	private int getScore() {
		return score;
	}
	private void setScore(){
		this.score=score;
		}
	;
	}


