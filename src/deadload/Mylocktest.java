package deadload;


public class Mylocktest {
	
	private /*synchronized*/ void m4t1()  { 
        int i = 5; 
       /* try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			  m4t2();
		}*/
      
        while(i-- > 0) { 
             System.out.println(Thread.currentThread().getName() + " : m4t1()=" + i); 
             try { 
                  Thread.sleep(500); 
             } catch(InterruptedException ie) { 
             } 
        } 
   } 
	private synchronized void m4t2()  { 
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
       int i = 5; 
       m4t1();
       while(i-- > 0) { 
            System.out.println(Thread.currentThread().getName() + " : m4t2()=" + i); 
            try { 
                 Thread.sleep(500); 
            } catch(InterruptedException ie) { 
            } 
       } 
  } 
	
	public static void main(String[] args) {  
        final Mylocktest myt2 = new Mylocktest();  
        Thread t1 = new Thread(  new Runnable() {  public void run() {  myt2.m4t1();  }  }, "t1"  );  
        Thread t2 = new Thread(  new Runnable() {  public void run() { myt2.m4t2();   }  }, "t2"  );  
        t1.start();  
        t2.start();  
   } 
}
