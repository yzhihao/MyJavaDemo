package fan1;

import java.util.ArrayList;
import java.util.List;

/**
 * ���͵����� <>
 * 1������: ��ǩ ����������
 * 2������: ʡ��  ��ȫ
 * @author bj
 *
 */
public class Simple {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<String>();
		//List<Integer>
		//��ȫ
		//list.add(1); //���ͼ��
		list.add("so easy");
		//ʡ��
		String ele =list.get(0);
		System.out.println(ele);
		
		//jdk1.4֮ǰ
		List list2 =new ArrayList();
		list2.add("old");
		
		//ȡ������
		Object obj =list2.get(0);
		//�鷳
		Integer num =(Integer)list2.get(0);
		System.err.println("num="+num);
		//����ȫ
		//num =(Integer)list2.get(1);
		if(list2.get(1) instanceof Integer){ //�ֶ����ͼ��
			num =(Integer)list2.get(1);//�ֶ�����ת�� ���ܰ�ȫ
		}
		
		
	}

}
