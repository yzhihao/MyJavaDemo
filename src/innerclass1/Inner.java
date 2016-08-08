package innerclass1;

public class Inner {
	  
    private class InsideClass implements Innerimp
    {
         public void increment()
         {
             System.out.println("这是一个测试");
         }
		
    }
    public Innerimp getIn()
    {
        return new InsideClass();
    }
	
}