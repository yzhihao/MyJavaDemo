package fan2;
/**
 * ���͵Ĳ���: ʹ��ʱ |ʵ��|�̳� û��ָ������ ��
 * ������ Object ,����ͬ�� Object
 * @author bj
 *
 */
public class MyStuApp {

	public static void main(String[] args) {
		//���� -->û��ָ�� ���͵ľ�������
		MyStudent student =new MyStudent();
		student.setJavase(100); //100 -->int -->Integer -->Object
		Object obj=student.getJavase();
		
		
		test(student);//���벻�����ͼ��
		MyStudent<Object> student2 =new MyStudent<Object>();
		//������ Object
		//test(student2);
	}
	
	public static void test(MyStudent<Integer> stu){
		
	}

}
