package observerpattern;

public class Client {
	
	public static void main(String[] args) {
		Subject subject=new PlaneSubject();
		Observer observer1=new LandObserver();
		Observer observer2=new SkyObserver();
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		subject.start();
	}
}
