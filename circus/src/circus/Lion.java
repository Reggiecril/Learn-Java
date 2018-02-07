package circus;

public class Lion extends Animal implements IAct{
	private String sex;
	private String color;
	@Override
	String hobit() {
		
		return "喜欢吃各种肉类";
	}

	@Override
	public String skill() {
		return "擅长钻火圈";
	}
	@Override
	void desciption() {
		this.setAge(2);
		this.setName("Lain");
		this.setColor("灰色");
		this.setSex("公狮");
		System.out.println("表演者："+this.getName()+"\n年龄："+this.getAge()+"岁\n技能："+this.skill()+"\n性别："+this.getSex()+"\n毛色："+this.getColor()+"\n爱好："+this.hobit());
		
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
