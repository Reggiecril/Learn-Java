package circus;

public class Bear extends Animal implements IAct{

	@Override
	public String hobit() {
		return "ϲ�����ȣ�";
	}

	@Override
	public String skill() {
		return "���Ż�����������ɡ��";
	}
	void desciption() {
		this.setName("Bill");
		this.setAge(1);
		System.out.println("�����ߣ�"+this.getName()+"\n���䣺"+this.getAge()+"��\n���ܣ�"+this.skill()+"\n���ã�"+this.hobit());
	}
}
