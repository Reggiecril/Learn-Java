package circus;

public class Clown extends Animal implements IAct {
	private String cloth;
	@Override
	public String skill() {
		return "脚踩高跷，进行杂技魔术表演";
	}

	@Override
	String hobit() {
		return null;
	}

	@Override
	void desciption() {
		this.setAge(5);
		this.setName("Kahle");
		this.setCloth("身穿五彩服装，踏着五彩祥云");
		System.out.println("表演者："+this.getName()+"\n艺龄："+this.getAge()+"岁\n技能："+this.skill()+"\n服装："+this.getCloth());
	}

	public String getCloth() {
		return cloth;
	}

	public void setCloth(String cloth) {
		this.cloth = cloth;
	}

}
