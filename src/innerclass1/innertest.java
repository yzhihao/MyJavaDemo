package innerclass1;
/*1.ʵ������
ƽʱ���Ƕ���ķ���Ȩ�ޣ�����ͨ����ǰ��ķ������η������Ƶģ�
һ��ķ��ڲ��࣬�ǲ������� private ��protectedȨ�޵ģ����ڲ�����ԣ�����������ͨ���ڲ������������ǵ���Ϣ��*/
public class innertest {
	 
	 public static void main(String args[])
	 {
		 Inner a=new Inner();
		 Innerimp a1=a.getIn();
	    a1.increment();
	 }
	}
