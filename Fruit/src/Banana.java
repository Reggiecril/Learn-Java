public class Banana extends Fruits{
    // ˽�����ԣ�Ʒ�֣�variety��
    private String variety;

    //�������ι��췽��Ϊ�������Ը�ֵ
    Banana(String shape,String taste,String variety){
    	this.setShape(shape);
    	this.setTaste(taste);
    	this.setVariety(variety);
    }

    //�����޲��޷���ֵ��advantage����������Ϊ��**����**,�������𣬿ɹ���ʳ��
    public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public void advantage() {
    	System.out.println(""+this.getVariety()+"����"+this.getShape()+",�������𣬿ɹ���ʳ");
    }
    
    //��������advantage������������color��������Ϊ��**��ɫΪ**
	public void advantage(String color) {
    	System.out.println(""+this.getVariety()+"��ɫΪ"+color);
    }

}
