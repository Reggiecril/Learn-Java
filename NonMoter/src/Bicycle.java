
public class Bicycle extends NonMoter{
	public Bicycle(String color,String brand,String type) {
		super(color,brand,type);
	}
	public String message() {
		return "这是一辆"+this.getColor()+"的，"+this.getBrand()+"的"+this.getType();
	}
}
