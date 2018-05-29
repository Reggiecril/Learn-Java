package Fly;

public class Panel implements IFly{
	//重写方法fly
	@Override
	public void fly() {
		System.out.println("飞机在天上飞");
	}
}
