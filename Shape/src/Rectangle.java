
public class Rectangle extends Shape{

	private double width;
	private double height;
	public Rectangle() {
		
	}
	//�����вι��죬ȡ�ĳ��Ϳ�
	public Rectangle(double width,double height) {
		this.setHeight(height);
		this.setWidth(width);
	}
	//�������
	@Override
	public void area() {
		double area=this.getHeight()*this.getWidth();
		System.out.println(area);
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

}
