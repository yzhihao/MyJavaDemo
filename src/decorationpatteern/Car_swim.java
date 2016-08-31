package decorationpatteern;

public class Car_swim implements Car{

	public Car car;

	
	public  Car_swim(Car car) {
		this.car = car;
	}
	private void swim() {
		System.out.println("我在游泳");
	}

	@Override
	public void run() {
		car.run();
		swim();
	}

}
