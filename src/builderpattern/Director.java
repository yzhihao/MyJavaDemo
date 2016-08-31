package builderpattern;

public class Director {

	public MWVCar getAMWVcar(){
		MWVCarbuilder a=new MWVCarbuilder();
		a.stop();
		a.start();
		return a.getmWVCar();
	}
	
	
}
