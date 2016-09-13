package template_methodpattern;

public abstract class Plane {
	protected abstract void method1();

	protected abstract void method2();

	public void template_method() {
		this.method1();

		this.method2();
	}
}
