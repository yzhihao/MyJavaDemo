package fan1;
/**
 * 泛型接口
 * 泛型不能使用在全局常量上
 * @author bj
 *
 * @param <T>
 */
public interface Comparator<T> {
	//全局常量
	/*public static final*/ int MAX_VALUE=1024;
	//公共的抽象方法
	/*public abstract */ T compare(T t);	
}