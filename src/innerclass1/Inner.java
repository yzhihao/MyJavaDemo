package innerclass1;

public class Inner {
	  
    private class InsideClass implements Innerimp
    {
         public void increment()
         {
             System.out.println("����һ������");
         }
		
    }
    public Innerimp getIn()
    {
        return new InsideClass();
    }
	
}