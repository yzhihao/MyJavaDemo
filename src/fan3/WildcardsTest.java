package fan3;

import java.util.ArrayList;
import java.util.List;

/**
 * ? -->ͨ��������Ͳ�ȷ����������������|�β���
 * ��������
 * 1����������
 * 2������������ ���ͷ��� ���ͽӿ���
 * 
 * 
 * @author bj
 *
 */
public class WildcardsTest {

	public static void main(String[] args) {
		//����
		List<?> list =new ArrayList<Integer>();
		list =new ArrayList<String>();
		list =new ArrayList<Object>();		
		test(list);
		
		//������� ���ܴ�������
		//list =new ArrayList<?>();
		
	}
	
	public static void test(List<?> list){
		
	}
	
	/*
	//�������ڷ��ͷ�����
	public static <?> void test2(List<?> list){
		
	}
	*/
	class Test<T>{
		
	}
	
	/* //�������ڴ���������
	class Test2<?>{
		
	}*/
	

}

