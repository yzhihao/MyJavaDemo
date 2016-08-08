package innerclass4;

public class Callee2 extends MyIncrement{
	public static void main(String[] args) {
		Callee2 Callee2=new Callee2();
		Callee2.increment();
		Incrementable a=Callee2.getCallbackReference();
		a.increment();
	}
	
 private int i=0;
 private void incr()
 {
       i++;
       System.out.println(i);
 }
 private class Closure implements Incrementable
 {
      public void increment()
      {
        incr();
      }
 }
 Incrementable getCallbackReference()
 {
      return new Closure();
 }
}
