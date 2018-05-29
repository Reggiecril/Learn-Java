
public class NonMoter {
	private String color;
	private String brand;
	private int lunzi;
	private int seat;
	private String type;

	
	NonMoter(){
		
	}
	NonMoter(String type){
		this.setType(type);
	}
	NonMoter(int lunzi,String type){
		this.setLunzi(lunzi);
		this.setType(type);
	}
	NonMoter(String color,String brand,String type){
		this.setColor(color);
		this.setBrand(brand);
		this.setType(type);
	}
	NonMoter(String color,String brand,int lunzi,int seat){
		this.setColor(color);
		this.setBrand(brand);
		this.setLunzi(lunzi);
		this.setSeat(seat);
		if(this.type==null)
		type="�ǻ�����";
		this.setType(type);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLunzi() {
		return lunzi;
	}
	public void setLunzi(int lunzi) {
		this.lunzi = lunzi;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public String message() {
		return "����һ��"+this.getColor()+"�ģ�"+this.getBrand()+"�� "+this.getType()+",��"+this.getLunzi()+"�����ӣ���"+this.getSeat()+"������";
	}
}
