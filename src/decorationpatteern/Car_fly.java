package decorationpatteern;

public class Car_fly implements Car {

	public Car car;

	public  Car_fly(Car car) {
		this.car = car;
	}

	private void fly() {
		System.out.println("我在飞");
	}

	@Override
	public void run() {
		fly();
		car.run();
	}

}
