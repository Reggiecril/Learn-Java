package circus;

public class Parrot extends Animal implements IAct{
	private String variety;
	@Override
	public String skill() {
		return "�ó�ģ��";
	}

	@Override
	String hobit() {
		
		return "ϲ���Լ��������";
	}

	@Override
	void desciption() {
		this.setName("Rose");
		this.setAge(1);
		this.setVariety("ĵ������");
		System.out.println("�����ߣ�"+this.getName()+"\n���䣺"+this.getAge()+"��\n���ܣ�"+this.skill()+"\nƷ�֣�"+this.getVariety()+"\n���ã�"+this.hobit());

	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

}
