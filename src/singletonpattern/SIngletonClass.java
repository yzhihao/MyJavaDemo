package singletonpattern;

/**
 * 饿汉式单例
 * @author yzh
 *
 */
public class SIngletonClass {

	public static final SIngletonClass a=new SIngletonClass();
	
	private SIngletonClass(){}
	
	public static SIngletonClass getSIngletonInstance() {
		return a;
	}
}
