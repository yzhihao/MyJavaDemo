package fan3;

import java.util.ArrayList;
import java.util.List;

/**
 * 1������û�ж�̬
 * 2������û������
 * @author 
 *
 */
public class Others {

	public static void main(String[] args) {
		//��̬
		Fruit f =new Apple();
		// ����û�ж�̬
//		List<Fruit> list =new ArrayList<Apple>();
		List<? extends Fruit> list =new ArrayList<Apple>();
		
		//����û������
		//Fruit<String>[] arr =new Fruit<String>[10];
		
		//jdk1.7���ͼ�
		List<Fruit> list2 =new ArrayList<>();
	}

}
