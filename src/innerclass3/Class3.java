package innerclass3;


public class Class3
{
   private class test1 extends Class1
    {
        public String name()
        {
          return super.name();
        }
    }
    private class test2 extends Class2
    {
       public int age()
       {
         return super.age();
       }
    }
   public String name()
    {
    return new test1().name();
   }
   public int age()
   {
       return new test2().age();
   }
   public static void main(String args[])
   {
       Class3 mi=new Class3();
       System.out.println("ĞÕÃû:"+mi.name());
       System.out.println("ÄêÁä:"+mi.age());
   }
}