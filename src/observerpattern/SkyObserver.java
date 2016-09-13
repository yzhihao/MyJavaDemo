package observerpattern;

public class SkyObserver implements Observer {

	@Override
	public void update(String context) {
		System.out.println("------这里是空中飞机-------");
		this.action(context);
		System.out.println("------空中飞机处理完毕-------");
	}

	@Override
	public void action(String context) {
		System.out.println("敌方飞机正在--->"+context+"。\n 我正在猛烈轰击它");
	}

}
