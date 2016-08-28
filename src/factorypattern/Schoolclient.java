package factorypattern;

public class Schoolclient {
	public static void main(String[] args) {
//		School school = SchoolFactory.getSchool("factorypattern.Huashischool");
		School school = SchoolFactory.getSchool("factorypattern.YuzhouSchool");
		school.say();
	}

}
