package methodinner;

public class Outer {
	 private int s = 100;
	 private int out_i = 1;
	 public void f(final int k){
	  final int s = 200;
	  int i = 1;
	  final int j = 10;
	  class Inner{ //�����ڷ����ڲ�
	   int s = 300;//���Զ������ⲿ��ͬ���ı���
	   //static int m = 20;//�����Զ��徲̬����
	   Inner(int k){
	    inner_f(k);
	   }
	   int inner_i = 100;
	   void inner_f(int k){
	    System.out.println(out_i);//����ڲ���û�����ⲿ��ͬ���ı��������ڲ����п���ֱ�ӷ����ⲿ���ʵ������
	    System.out.println(k);//*****���Է����ⲿ��ľֲ�����(�������ڵı���)�����Ǳ���������final��*****
//	    System.out.println(i);
	    System.out.println(s);//����ڲ����������ⲿ��ͬ���ı�����ֱ���ñ��������ʵ����ڲ���ı���
	    System.out.println(this.s);//��"this.������" ���ʵ�Ҳ���ڲ������
	    System.out.println(Outer.this.s);//���ⲿ"�ⲿ������.this.������" ���ʵ����ⲿ�����
	   }
	  }
	  new Inner(k);
	 }

	 public static void main(String[] args) {
	 //���ʾֲ��ڲ�����������ⲿ�����
	  Outer out = new Outer();
	  out.f(3);
	 }

	}
/*�����ⲻ��ֱ�����ɾֲ��ڲ��ࣨ��֤�ֲ��ڲ�������ǲ��ɼ��ģ���
Ҫ��ʹ�þֲ��ڲ���ʱ��Ҫ���ɶ��󣬶�����÷������ڷ����в��ܵ�����ֲ��ڲ��ࡣ
ͨ���ڲ���ͽӿڴﵽһ��ǿ�Ƶ�����ϣ�
�þֲ��ڲ�����ʵ�ֽӿڣ����ڷ����з��ؽӿ����ͣ�ʹ�ֲ��ڲ��಻�ɼ�������ʵ����Ŀɼ��ԡ�*/