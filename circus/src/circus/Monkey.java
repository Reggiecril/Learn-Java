package circus;

public class Monkey extends Animal implements IAct {
	private String variety;
	@Override
	public String skill() {
		return "骑独轮车过独木桥";
	}

	@Override
	String hobit() {
		return "爱好模仿别人的动作表情";
	}

	@Override
	void desciption() {
		this.setAge(1);
		this.setName("Tom");
		this.setVariety("金丝猴");
		System.out.println("表演者："+this.getName()+"\n年龄："+this.getAge()+"岁\n技能："+this.skill()+"\n品种："+this.getVariety()+"\n爱好："+this.hobit());

	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

}
