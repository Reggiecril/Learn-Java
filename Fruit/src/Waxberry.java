//Ҫ��Waxberry�಻����������
public class Waxberry extends Fruits{
    // ˽�����ԣ���ɫ��color��
    private String color;

	//�������췽������ɵ��ø���Ĺ��췽����������Ը�ֵ
    Waxberry(String shape,String taste,String color){
    	super(shape,taste);
    	this.setColor(color);
    }
    //������������д��face����������Ϊ����÷��**��**����ζ��������
    public final void face() {
    	System.out.println("��÷��"+this.getColor()+this.getShape()+this.getTaste()+"����ζ��������");
    }
    
    //��д����eat����������Ϊ����÷�������У��ǳ��óԣ�
    public void eat() {
    	System.out.println("��÷�������У��ǳ��óԣ�");
    }
    	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
    
    //��дtoString����������ı�����ʽ��ͬ�����shape,color,taste��
	public String toString() {
		return this.getColor()+this.getShape()+this.getTaste();
		
	}
}
