package fan1;

/**
 * �Զ��巺���� 
 * 1��<> -->������д��ĸ�������ܼ���֪�� 
 * 2�� 
 * T Type 
 * K V Key Value 
 * E Element
 * 
 * 3��ע���: 
 * ���Ͳ���ʹ���ھ�̬������
 * ָ�������Ͳ���Ϊ��������
 * @author bj
 *
 */
// T -->type ����
public class MyStudent<T> {
	private T javase;
	//private static T test; //���Ͳ���ʹ���ھ�̬������
	public MyStudent() {
	}

	public MyStudent(T javase) {
		this.javase = javase;
	}

	public  T getJavase() {
		return  javase;
	}

	public void setJavase(T javase) {
		this.javase = javase;
	}
}
