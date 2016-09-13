package chain_respattern;

public class Director {
	
	public static void director(Plane plane){
		Handler handler1=new BigPlaneHandle();
		Handler handler2=new Plane747Handle();
		Handler handler3=new ArmyPlaneHandle();
		Handler handler4=new LittlePlaneHandle();
		handler1.setnext(handler2);
		handler2.setnext(handler3);
		handler3.setnext(handler4);
		handler1.handle(plane);
	}
}
