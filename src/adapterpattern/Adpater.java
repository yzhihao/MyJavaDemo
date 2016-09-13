package adapterpattern;

public class Adpater implements Plane {
	APlane aPlane=new APlane();
	
	@Override
	public void start() {
		aPlane.start_stop("start");
	}

	@Override
	public void engineboom() {
		aPlane.engineboom_alarm("engineboom");
	}

	@Override
	public void alarm() {
		aPlane.engineboom_alarm("other");
	}

	@Override
	public void stop() {
		aPlane.start_stop("other");
	}

}
