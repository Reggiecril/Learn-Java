
public class Circle extends Shape{
	private double r;
	//���峣����
	public static final double ��=3.1415;
	//�����вι��죬ȡ�İ뾶
	public Circle(double r) {
		this.setR(r);
	}
	@Override
	public void area() {
		double area=this.getR()*this.getR()*��;
		System.out.println(area);
		
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
}
