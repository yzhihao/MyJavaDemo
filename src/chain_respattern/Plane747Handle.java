package chain_respattern;

public class Plane747Handle extends Handler{

	@Override
	public void respose(Plane plane) {
		plane.fly();
		System.out.println("自己拿飞机头撞它啊");		
	}

	@Override
	public int gethandletype() {
		return 2;
	}

}
