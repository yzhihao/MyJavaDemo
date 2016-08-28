package singletonpattern;

/**
 *懒汉式单例
 * @author yzh
 *
 */
public class LazySingleton {
	
	public static LazySingleton a;

	private LazySingleton() {
	}

	public synchronized LazySingleton getSingletonInstance() {
		if (a == null) {
			a = new LazySingleton();
		}
		return a;
	}
}
