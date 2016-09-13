package strategypattern;

public class LandPlane implements DealPlane {

	@Override
	public void operate() {
		System.out.println("敌军来了，地面飞机正在放鸟");
	}

}
