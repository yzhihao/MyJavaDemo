package staticinner;

/*	ע�⣺
�����ⲻ��ֱ�����ɾֲ��ڲ��ࣨ��֤�ֲ��ڲ�������ǲ��ɼ��ģ���Ҫ��ʹ�þֲ��ڲ���ʱ��Ҫ���ɶ��󣬶�����÷������ڷ����в��ܵ�����ֲ��ڲ��ࡣͨ���ڲ���ͽӿڴﵽһ��ǿ�Ƶ�����ϣ��þֲ��ڲ�����ʵ�ֽӿڣ����ڷ����з��ؽӿ����ͣ�ʹ�ֲ��ڲ��಻�ɼ�������ʵ����Ŀɼ��ԡ�

3����̬�ڲ��ࣺ ��̬�ڲ��ඨ�������У��κη����⣬��static���塣
ע�⣺��̬�ڲ����п��Զ��徲̬���߷Ǿ�̬�ĳ�Ա*/
public class Outer1 {
 private static int i = 1;
 private int j = 10;
 public static void outer_f1(){
 
 }
 public void outer_f2(){
 
 }
// ��̬�ڲ��������public,protected,private����
// ��̬�ڲ����п��Զ��徲̬���߷Ǿ�̬�ĳ�Ա
 static class Inner{
  static int inner_i = 100;
  int inner_j = 200;
  static void inner_f1(){
   System.out.println("Outer.i"+i);//��̬�ڲ���ֻ�ܷ����ⲿ��ľ�̬��Ա
   outer_f1();//������̬�����;�̬����
  }
  void inner_f2(){
//   System.out.println("Outer.i"+j);//��̬�ڲ��಻�ܷ����ⲿ��ķǾ�̬��Ա
//   outer_f2();//�����Ǿ�̬�����ͷǾ�̬����
  } 
 
 }
 
 public void outer_f3(){
//  �ⲿ������ڲ���ľ�̬��Ա���ڲ���.��̬��Ա
  System.out.println(Inner.inner_i);
  Inner.inner_f1();
//  �ⲿ������ڲ���ķǾ�̬��Ա:ʵ�����ڲ��༴��
  Inner inner = new Inner();
  inner.inner_f2();
 
 }
 public static void main(String[] args) {
  new Outer1().outer_f3();
 }

}