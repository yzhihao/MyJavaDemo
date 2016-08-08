package innerclass1;
/*1.实现隐藏
平时我们对类的访问权限，都是通过类前面的访问修饰符来限制的，
一般的非内部类，是不允许有 private 与protected权限的，但内部类可以，所以我们能通过内部类来隐藏我们的信息。*/
public class innertest {
	 
	 public static void main(String args[])
	 {
		 Inner a=new Inner();
		 Innerimp a1=a.getIn();
	    a1.increment();
	 }
	}
