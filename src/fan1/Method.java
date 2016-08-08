package fan1;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * �Ƿ������� ���巺�ͷ���
 * ����: �ڷ�������ǰ�� <��ĸ>
 * @author bj
 *
 */
public class Method {
	//���ͷ���
	public static <T> void test(T t){
		System.out.println(t);
	}
	
	public static <T extends List> void test(T t){
		System.out.println(t);
		t.add("aaa");
	}
	//�ͷ���Դ
	public static <T extends Closeable> void test(T... a){
		for(T temp:a){
			try {
			   if(null!=temp){  
				   temp.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		test("bjsxt is very good");
		test(new FileInputStream("a.txt"));
		
		
	}

}
