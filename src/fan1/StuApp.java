package fan1;
/**
 * û�з��͵� �� �洢���� -->�鷳
 * @author bj
 *
 */
public class StuApp {

	public static void main(String[] args) {
		 //�������� int -->Integer -->Object
	    Student stu = new Student(80);
	 
	    Object javase =stu.getJavase();
	    //���ͼ��  ����ת���쳣	
	    if(javase  instanceof Integer){
	      //ǿ������ת��
	      Integer javaseScore =(Integer) javase ;
	    }
	    
	    
	    stu =new Student("����");
	    javase =stu.getJavase();
	    //���ͼ��  ����ת���쳣	
	    if(javase  instanceof String){
	      //ǿ������ת��
	      String javaseScore =(String) javase ;
	    }
	    
	}

}
