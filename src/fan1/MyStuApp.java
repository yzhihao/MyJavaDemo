package fan1;
/**
 * �Զ��巺�����ʹ�ã�
 * ������ʱָ����������ͣ�
 * ����Ϊ��������
 * @author bj
 *
 */
public class MyStuApp {

	public static void main(String[] args) {
		//MyStudent<int> stu =new MyStudent<int>();
		MyStudent<Integer> stu =new MyStudent<Integer>();
		//1����ȫ:���ͼ��
		//stu.setJavase("����");
		stu.setJavase(80);
		//2��ʡ��:�Զ�����ת������ȥ�����ͼ��
		Integer score=stu.getJavase();
		System.out.println(score);
		
	}

}
