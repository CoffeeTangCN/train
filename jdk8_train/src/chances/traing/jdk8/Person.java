package chances.traing.jdk8;

public class Person {
	private String name;
	private int age;
	public Person(String string, String string2) {
		this.name = string;
		this.age = Integer.parseInt(string2);
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
