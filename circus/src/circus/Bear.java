package circus;

public class Bear extends Animal implements IAct{

	@Override
	public String hobit() {
		return "喜欢卖萌！";
	}

	@Override
	public String skill() {
		return "挽着花篮，打着雨伞！";
	}
	void desciption() {
		this.setName("Bill");
		this.setAge(1);
		System.out.println("表演者："+this.getName()+"\n年龄："+this.getAge()+"岁\n技能："+this.skill()+"\n爱好："+this.hobit());
	}
}
