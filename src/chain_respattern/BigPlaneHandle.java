package chain_respattern;

public class BigPlaneHandle extends Handler{

	@Override
	public void respose(Plane plane) {
		plane.fly();
		System.out.println("我就是站长，你怎么回事");		
	}

	@Override
	public int gethandletype() {
		return 1;
	}

}
