
public class Bicycle extends NonMoter{
	public Bicycle(String color,String brand,String type) {
		super(color,brand,type);
	}
	public String message() {
		return "����һ��"+this.getColor()+"�ģ�"+this.getBrand()+"��"+this.getType();
	}
}
