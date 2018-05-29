package circus;

public abstract class Animal {
	Animal(){
		
	}
	private String name;
	private int age;
	abstract String hobit();
	abstract void desciption();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
