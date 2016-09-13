package chain_respattern;

public class LittlePlaneHandle extends Handler{

	@Override
	public void respose(Plane plane) {
		plane.fly();
		System.out.println("小飞机拼命射击，最终战胜了它们");		
	}

	@Override
	public int gethandletype() {
		return 4;
	}

}
