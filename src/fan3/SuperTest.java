package fan3;

import java.util.ArrayList;
import java.util.List;

/**
 * super : ���͵�����  >= �����������
 * 1��һ������ ���޲���
 * 2���ܹ�����������棬������Ӹ�����
 * 3������
 *  List<Fruit> -->List<? super Apple>
 *  List<Apple> -->List<? super Apple>
 *  List<? super Fruit> -->List<?super Apple>
 *  ���ܴ��
 *  List<? super FujiApple> -->List<?super Apple>
 *  
 * 
 * @author bj
 *
 */
public class SuperTest {

	public static void main(String[] args) {
		// >= �����������
		List<Apple> list1 =new ArrayList<Apple>();
		test(list1);
		List<Fruit> list2 =new ArrayList<Fruit>();
		test(list2);
		List<Object> list3 =new ArrayList<Object>();
		test(list3);
		
		//����
		List<? super Apple> list4 =new ArrayList<Apple>();
		test(list4);
		List<? super Fruit> list5 =new ArrayList<Object>();
		test(list5);
		List<? super FujiApple> list6 =new ArrayList<Object>();
		//test(list6);
		List<?> list7 =new ArrayList<Object>();
//		test(list7);

	}
	
	public static void test(List<? super Apple> list){
		//������� �������
		list.add(new Apple());
		list.add(new FujiApple());
		//list.add(new Fruit());
	}
	

}
