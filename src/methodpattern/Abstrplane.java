package methodpattern;

public abstract class Abstrplane implements Plane {
	public Plane plane;
	
	public void setPlane(Plane plane) {
		this.plane = plane;
	}
	public abstract void start(); 
	public abstract void stop(); 
	public abstract void fly();
	public abstract void boom();
	
	public void run(){
		System.out.println("---------离开机场------------");
		plane.start();
		plane.fly();
		plane.boom();
		
	}
}
