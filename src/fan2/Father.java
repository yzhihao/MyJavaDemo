package fan2;
/**
 * ���͸��࣬����Ϊ������ 
 * 1���������෺�� -->����Ϊ����
 * 2�����������෺�� -->���ఴ��ʵ��
 * 
 * ���� ������ ���� -->��λ�ö���
 * 1)��������д���������� -->�游�����
 * ������������������ -->���������
 * 2)��������ʹ�ø�������� -->�游�����
 * ������ʹ���Լ������� -->���������
 * 
 * 
 * @author bj
 *
 */
public abstract class Father<T1,T2> {
	T1 age;
	public abstract void test(T2 name);

}

//����  -->��������
//1)��ȫ������
class C1<T1,T2,A,B> extends Father<T1,T2>{	
	A Sex;
	@Override
	public void test(T2 name) {
		//this.age -->T1
	}
	
	public void test2(A a){
		
	}
	
	
}
//2)�����ֱ���
class C2<T2,A,B> extends Father<Integer,T2>{

	@Override
	public void test(T2 name) {
		//this.age -->Integer
	}
	
}
//������  -->����ʵ��
//1)����������
class C3 extends Father<Integer,String>{
	
	@Override
	public void test(String name) {
		//this.age -->Integer
	}
}
//2)��û������ ���� Object
class C4 extends Father{
	
	@Override
	public void test(Object name) {
		//this.age -->Object
	}
}


