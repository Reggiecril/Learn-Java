package Fly;

public class Balloon implements IFly{
	//重写方法fly
	@Override
	public void fly() {
		System.out.println("气球在天上飞");
	}
}
