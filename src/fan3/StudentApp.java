package fan3;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ����Ƕ�� -->���⵽�ڲ��
 * 
 * 
 * @author bj
 *
 */
public class StudentApp {

	public static void main(String[] args) {
		Student<String> stu =new Student<String>();		
		stu.setScore("����");
		System.out.println(stu.getScore());
		
		//����Ƕ��
		Bjsxt<Student<String>> bjsxt =new Bjsxt<Student<String>>();
		bjsxt.setStu(stu);
		
		stu=bjsxt.getStu();
		String score =stu.getScore();
		System.out.println(score);
		
		
	/*	//HashMap -->ʹ�÷���Ƕ��
		Map<String,String> map =new HashMap<String,String>();
		map.put("a", "java300");
		map.put("b", "��ʿ��javase");
		
		Set<Entry<String,String>> entrySet= map.entrySet();
		for(Entry<String,String> entry:entrySet){
			String key =entry.getKey();
			String value =entry.getValue();
			System.out.println(key+"-->"+value);
		}*/
		
		
	}

}
