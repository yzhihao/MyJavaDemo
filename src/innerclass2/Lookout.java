package innerclass2;


public class Lookout {
	 
	 private String name="liutao";
	   private class InTest
	   {
	      public InTest()
	      {
	          System.out.println(name);
	      }
	   }
	   public void test()
	   {
	    new InTest();
	   }
	   public static void main(String args[])
	   {
	       Lookout bb=new Lookout();
	       bb.test();
	   }
}