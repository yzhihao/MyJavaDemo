package chain_respattern;

public class ArmyPlaneHandle extends Handler{

	@Override
	public void respose(Plane plane) {
		plane.fly();
		System.out.println("军机又怎么样，看我把它打下来");		
	}

	@Override
	public int gethandletype() {
		return 3;
	}

}
