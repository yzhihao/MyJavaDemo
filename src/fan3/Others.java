package fan3;

import java.util.ArrayList;
import java.util.List;

/**
 * 1、泛型没有多态
 * 2、泛型没有数组
 * @author 
 *
 */
public class Others {

	public static void main(String[] args) {
		//多态
		Fruit f =new Apple();
		// 泛型没有多态
//		List<Fruit> list =new ArrayList<Apple>();
		List<? extends Fruit> list =new ArrayList<Apple>();
		
		//泛型没有数组
		//Fruit<String>[] arr =new Fruit<String>[10];
		
		//jdk1.7泛型简化
		List<Fruit> list2 =new ArrayList<>();
	}

}
