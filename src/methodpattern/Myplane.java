package methodpattern;

public class Myplane  extends Abstrplane{

	@Override
	public void start() {
		System.out.println("我的飞机起飞啦啦");		
	}

	@Override
	public void stop() {
		System.out.println("我的飞机降落啦");
	}

	@Override
	public void fly() {
		System.out.println("我的飞机飞的很高，欲与天公试比高");
	}

	@Override
	public void boom() {
		System.out.println("我的飞机飞的太高，被雷劈了。。。。");
	}

}
