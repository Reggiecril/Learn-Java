package circus;

public class Parrot extends Animal implements IAct{
	private String variety;
	@Override
	public String skill() {
		return "擅长模仿";
	}

	@Override
	String hobit() {
		
		return "喜欢吃坚果和松子";
	}

	@Override
	void desciption() {
		this.setName("Rose");
		this.setAge(1);
		this.setVariety("牡丹鹦鹉");
		System.out.println("表演者："+this.getName()+"\n年龄："+this.getAge()+"岁\n技能："+this.skill()+"\n品种："+this.getVariety()+"\n爱好："+this.hobit());

	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

}
