package fan2;
/**
 * ���ͽӿ�  �� ������  ͬ��
 * @author bj
 *
 */
public interface Comparator<T> {
	//ȫ�ֳ���
	public static final int MAX_VALUE=100;
	//�������󷽷�
	public abstract void test(T t);
}

//ʵ��,Ĭ��ΪObject
class InterC1<A> implements Comparator{

	@Override
	public void test(Object t) {
		
	}
}
class InterC2<A> implements Comparator<Integer>{
	
	@Override
	public void test(Integer t) {
		// TODO Auto-generated method stub
		
	}
}
class InterC3<T,A> implements Comparator<T>{

	@Override
	public void test(T t) {
		
	}
}