package circus;

public class Monkey extends Animal implements IAct {
	private String variety;
	@Override
	public String skill() {
		return "����ֳ�����ľ��";
	}

	@Override
	String hobit() {
		return "����ģ�±��˵Ķ�������";
	}

	@Override
	void desciption() {
		this.setAge(1);
		this.setName("Tom");
		this.setVariety("��˿��");
		System.out.println("�����ߣ�"+this.getName()+"\n���䣺"+this.getAge()+"��\n���ܣ�"+this.skill()+"\nƷ�֣�"+this.getVariety()+"\n���ã�"+this.hobit());

	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

}
