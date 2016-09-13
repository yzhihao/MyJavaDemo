package facadepattern;

public class Facade {
	A a=new A();
	B b=new B();
	C c=new C();
	
	public void invokea(){
		a.a();
		b.a();
		c.a();
	}
	
	public void invokeb(){
		a.b();
		b.b();
		c.b();
	}
	
	public void invokec(){
		a.c();
		b.c();
		c.c();
	}
}
