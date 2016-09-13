package strategypattern;

public class Context {
	private DealPlane dealPlane;

	public DealPlane getDealPlane() {
		return dealPlane;
	}

	public void setDealPlane(DealPlane dealPlane) {
		this.dealPlane = dealPlane;
	}
	
	public void testPlane(){
		this.dealPlane.operate();
	}
	
}
