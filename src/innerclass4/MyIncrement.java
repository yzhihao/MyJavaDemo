package innerclass4;

public class MyIncrement {
	 
    public void increment()
    {
      System.out.println("Other increment()");
    }
    static void f(MyIncrement f)
    {
        f.increment();
    }
 
}