package basethread;

/*�ܹ��ܺõ���Դ��������������Ʊ��ʱ��*/
class MyThread implements Runnable{
	 
    private int ticket = 5;  //5��Ʊ
 
    public void run() {
        for (int i=0; i<=20; i++) {
            if (this.ticket > 0) {
                System.out.println(Thread.currentThread().getName()+ "������Ʊ"+this.ticket--);
            }
        }
    }
}
public class diftest {
     
    public static void main(String [] args) {
        MyThread my = new MyThread();
        new Thread(my, "1�Ŵ���").start();
        new Thread(my, "2�Ŵ���").start();
        new Thread(my, "3�Ŵ���").start();
    }
}

/*������Դ����*/
class hello extends Thread {
    public void run() {
        for (int i = 0; i < 7; i++) {
            if (count > 0) {
                System.out.println("count= " + count--);
            }
        }
    }
 
    public static void main(String[] args) {
        hello h1 = new hello();
        hello h2 = new hello();
        hello h3 = new hello();
        h1.start();
        h2.start();
        h3.start();
    }
 
    private int count = 5;
}