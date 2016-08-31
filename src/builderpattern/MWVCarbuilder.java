package builderpattern;

public class MWVCarbuilder extends Builder {
	MWVCar mWVCar=new MWVCar();
	
	@Override
	public void start() {
		mWVCar.start("宝马在开始跑");
	}

	@Override
	public void engineboom() {
		mWVCar.engineboom("宝马引擎在呼啸");
	}

	@Override
	public void alarm() {
		mWVCar.alarm("宝马在按喇叭");
	}

	@Override
	public void stop() {
		mWVCar.stop("宝马停止了");		
	}

	public  MWVCar getmWVCar(){
		return mWVCar;
	}
}
