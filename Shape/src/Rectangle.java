
public class Rectangle extends Shape{

	private double width;
	private double height;
	public Rectangle() {
		
	}
	//建立有参构造，取的长和宽
	public Rectangle(double width,double height) {
		this.setHeight(height);
		this.setWidth(width);
	}
	//计算面积
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
