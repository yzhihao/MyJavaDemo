package strategypattern;

public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		DealPlane dealPlane = new LandPlane();
		context.setDealPlane(dealPlane);
		context.testPlane();

	}
}
