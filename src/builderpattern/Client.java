package builderpattern;

public class Client {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		MWVCar car=new Director().getAMWVcar();
	}
	
}
