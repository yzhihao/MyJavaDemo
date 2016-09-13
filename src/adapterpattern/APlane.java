package adapterpattern;

public class APlane {

	public void start_stop(String status) {
		if (status.equals("start")) {
			System.out.println("鬼知道谁的飞机在开飞了");
		} else {
			System.out.println("鬼知道谁的飞机在降落了");
		}
	}

	public void engineboom_alarm(String status) {
		if (status.equals("engineboom")) {
			System.out.println("鬼知道谁的飞机轰轰轰");
		} else {
			System.out.println("鬼知道谁的飞机BB");
		}
	}
}
