public class Fruits {
    // ˽�����ԣ�ˮ������״��shape���ͿڸУ�taste��
	private String shape;
	private String taste;

	public Fruits() {

	}

	// ���ι��캯��������Ϊshape��taste��
	
	public Fruits(String shape,String taste) {
		this.setShape(shape);
		this.setTaste(taste);
	}
    //ͨ����װʵ�ֶ�˽�����Ե�get/set����
	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	// �����޲��޷���ֵ�÷���eat����������Ϊ��ˮ���ɹ�����ʳ�ã���
	public void eat() {
		System.out.println("ˮ���ɹ�����ʳ�ã�");
	}



	// ��дequals�������Ƚ����������Ƿ���ȣ��Ƚ�shape��taste��
	public boolean equals(Fruits fr) {
		if(fr==null)
			fr=new Fruits();
		boolean b;
		if(fr.getShape()==this.getShape()&&fr.getTaste()==this.getTaste())
			b=true;
		else
			b=false;
		return b;
	}


}