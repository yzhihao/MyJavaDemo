package builderpattern;

public class BenzCarbuilder extends Builder {

	BenzCar benzCar=new BenzCar();
	
	@Override
	public void start() {
		benzCar.start("奔驰在开始跑");
	}

	@Override
	public void engineboom() {
		benzCar.engineboom("奔驰引擎在呼啸");
	}

	@Override
	public void alarm() {
		benzCar.alarm("奔驰在按喇叭");
	}

	@Override
	public void stop() {
		benzCar.stop("奔驰停止了");		
	}

	public  BenzCar getbenzCar(){
		return benzCar;
	}
}
