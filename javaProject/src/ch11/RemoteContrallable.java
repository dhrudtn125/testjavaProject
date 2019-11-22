package ch11;

public interface RemoteContrallable extends Contrallable{
	//같은 인터페이스인 Contrallable 을 상속 받았다.
	void remoteOn();
	void remoteOff();
}
