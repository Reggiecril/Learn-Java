
public class ElectricVehicle extends NonMoter{
	
	private String battery;
	ElectricVehicle(String battery,String type) {
		super(type);
		this.setBattery(battery);
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	public String message() {
		return "这是一辆使用"+this.getBattery()+"电池的"+this.getType();
	}
}
