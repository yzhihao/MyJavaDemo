package factorypattern;

public class SchoolFactory {

	public static  School getSchool(String classname)  {
		School school = null;
		try {
			school = (School) Class.forName(classname).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return school;
	}
	
	
}
