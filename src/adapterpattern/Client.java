package adapterpattern;

public class Client {

	public static void main(String[] args) {
		Plane plane1 = new Myplane();
		Plane plane2 = new Adpater();
		plane2.start();
		plane1.start();
	}
}
