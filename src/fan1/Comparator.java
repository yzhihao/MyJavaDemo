package fan1;
/**
 * ���ͽӿ�
 * ���Ͳ���ʹ����ȫ�ֳ�����
 * @author bj
 *
 * @param <T>
 */
public interface Comparator<T> {
	//ȫ�ֳ���
	/*public static final*/ int MAX_VALUE=1024;
	//�����ĳ��󷽷�
	/*public abstract */ T compare(T t);	
}