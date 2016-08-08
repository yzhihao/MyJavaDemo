package basethread;

/*能够很好的资源共享，比如在卖火车票的时候*/
class MyThread implements Runnable{
	 
    private int ticket = 5;  //5张票
 
    public void run() {
        for (int i=0; i<=20; i++) {
            if (this.ticket > 0) {
                System.out.println(Thread.currentThread().getName()+ "正在卖票"+this.ticket--);
            }
        }
    }
}
public class diftest {
     
    public static void main(String [] args) {
        MyThread my = new MyThread();
        new Thread(my, "1号窗口").start();
        new Thread(my, "2号窗口").start();
        new Thread(my, "3号窗口").start();
    }
}

/*不能资源共享*/
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