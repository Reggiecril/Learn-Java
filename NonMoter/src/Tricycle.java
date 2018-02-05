
public class Tricycle extends NonMoter{
	Tricycle(int lunzi,String type){
		super(lunzi,type);
		
	}
	public String message() {
		return "三轮车是一款有"+this.getLunzi()+"轮子的"+this.getType();
	}
}
