package circus;

public class Clown extends Animal implements IAct {
	private String cloth;
	@Override
	public String skill() {
		return "�Ųȸ��Σ������Ӽ�ħ������";
	}

	@Override
	String hobit() {
		return null;
	}

	@Override
	void desciption() {
		this.setAge(5);
		this.setName("Kahle");
		this.setCloth("����ʷ�װ��̤���������");
		System.out.println("�����ߣ�"+this.getName()+"\n���䣺"+this.getAge()+"��\n���ܣ�"+this.skill()+"\n��װ��"+this.getCloth());
	}

	public String getCloth() {
		return cloth;
	}

	public void setCloth(String cloth) {
		this.cloth = cloth;
	}

}
