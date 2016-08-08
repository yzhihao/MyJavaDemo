package staticinner;

/*	注意：
在类外不可直接生成局部内部类（保证局部内部类对外是不可见的）。要想使用局部内部类时需要生成对象，对象调用方法，在方法中才能调用其局部内部类。通过内部类和接口达到一个强制的弱耦合，用局部内部类来实现接口，并在方法中返回接口类型，使局部内部类不可见，屏蔽实现类的可见性。

3、静态内部类： 静态内部类定义在类中，任何方法外，用static定义。
注意：静态内部类中可以定义静态或者非静态的成员*/
public class Outer1 {
 private static int i = 1;
 private int j = 10;
 public static void outer_f1(){
 
 }
 public void outer_f2(){
 
 }
// 静态内部类可以用public,protected,private修饰
// 静态内部类中可以定义静态或者非静态的成员
 static class Inner{
  static int inner_i = 100;
  int inner_j = 200;
  static void inner_f1(){
   System.out.println("Outer.i"+i);//静态内部类只能访问外部类的静态成员
   outer_f1();//包括静态变量和静态方法
  }
  void inner_f2(){
//   System.out.println("Outer.i"+j);//静态内部类不能访问外部类的非静态成员
//   outer_f2();//包括非静态变量和非静态方法
  } 
 
 }
 
 public void outer_f3(){
//  外部类访问内部类的静态成员：内部类.静态成员
  System.out.println(Inner.inner_i);
  Inner.inner_f1();
//  外部类访问内部类的非静态成员:实例化内部类即可
  Inner inner = new Inner();
  inner.inner_f2();
 
 }
 public static void main(String[] args) {
  new Outer1().outer_f3();
 }

}