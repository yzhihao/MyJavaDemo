package prototypepattern;

public class Class implements Cloneable {

	private String name;
	private Student student;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Class clone() throws CloneNotSupportedException{
		Class class1=(Class) super.clone();
		return class1;
	}
	
}
