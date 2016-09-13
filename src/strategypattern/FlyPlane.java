package strategypattern;

public class FlyPlane implements DealPlane{

	@Override
	public void operate() {
		System.out.println("敌军上天了，空中飞机正在撞击自毁");		
	}

}
