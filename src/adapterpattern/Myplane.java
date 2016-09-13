package adapterpattern;

public class Myplane implements Plane {

	@Override
	public void start() {
		System.out.println("我的飞机在开飞了");

	}

	@Override
	public void engineboom() {
		System.out.println("我的飞机轰轰轰");
	}

	@Override
	public void alarm() {
		System.out.println("我的飞机BB");
	}

	@Override
	public void stop() {
		System.out.println("我的飞机在降落了");
	}

}
