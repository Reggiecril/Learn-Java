
public class Tricycle extends NonMoter{
	Tricycle(int lunzi,String type){
		super(lunzi,type);
		
	}
	public String message() {
		return "���ֳ���һ����"+this.getLunzi()+"���ӵ�"+this.getType();
	}
}
