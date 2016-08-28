package singletonpattern;

/**
 * IODH技术，实现了懒汉和饿汉单例的所有优点
 * @author yzh
 *
 */
public class IODH {

	
	public static  class inner{
		public static final IODH a=new IODH();
	}
	
	private IODH(){}
	
	public IODH getSingletonInstance(){
		return inner.a;
	}
}
