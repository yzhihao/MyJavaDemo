package prototypepattern;

public class School implements Cloneable {

	private String name;
	private Class class1=new Class();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Class getClass1() {
		return class1;
	}

	public void setClass1(Class class1) {
		this.class1 = class1;
	}
	
	
	public School clone() throws CloneNotSupportedException{
		School school=(School) super.clone();
		school.class1=this.class1.clone();
			return school;
	}
}
