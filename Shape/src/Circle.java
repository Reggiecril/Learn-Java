
public class Circle extends Shape{
	private double r;
	//定义常量π
	public static final double π=3.1415;
	//建立有参构造，取的半径
	public Circle(double r) {
		this.setR(r);
	}
	@Override
	public void area() {
		double area=this.getR()*this.getR()*π;
		System.out.println(area);
		
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
}
