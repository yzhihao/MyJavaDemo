package methodpattern;

public class Client {
	public static void main(String[] args) {
		Myplane myplane=new Myplane();
		myplane.setPlane(myplane);
		myplane.run();
	}
}
