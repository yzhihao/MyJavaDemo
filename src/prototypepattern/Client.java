package prototypepattern;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		School a = new School();
		School b = a.clone();
		System.out.println("a的hashCode=" + a.hashCode());
		System.out.println("b的hashCode=" + b.hashCode());
		System.out.println("a的class1的hashCode=" + a.getClass1().hashCode());
		System.out.println("b的class1的hashCode=" + b.getClass1().hashCode());
	}

}
