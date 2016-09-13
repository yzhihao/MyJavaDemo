package observerpattern;

public class LandObserver implements Observer {

	@Override
	public void update(String context) {
		System.out.println("------这里是地面飞机-------");
		this.action(context);
		System.out.println("------地面飞机处理完毕-------");
	}

	@Override
	public void action(String context) {
		System.out.println("敌方飞机正在--->"+context+"。\n 我正在放鸟撞击");
	}

}
