package circus;

public class Lion extends Animal implements IAct{
	private String sex;
	private String color;
	@Override
	String hobit() {
		
		return "ϲ���Ը�������";
	}

	@Override
	public String skill() {
		return "�ó����Ȧ";
	}
	@Override
	void desciption() {
		this.setAge(2);
		this.setName("Lain");
		this.setColor("��ɫ");
		this.setSex("��ʨ");
		System.out.println("�����ߣ�"+this.getName()+"\n���䣺"+this.getAge()+"��\n���ܣ�"+this.skill()+"\n�Ա�"+this.getSex()+"\nëɫ��"+this.getColor()+"\n���ã�"+this.hobit());
		
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
