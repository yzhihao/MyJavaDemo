package decorationpatteern;

public class Client {

	public static void main(String[] args) {
		Car car=new MyCar();
		Car_fly car_fly=new Car_fly(car);
		Car_swim car_swim=new Car_swim(car_fly);
		car_swim.run();
	}
	
}
