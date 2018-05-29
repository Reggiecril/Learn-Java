package Fly;

public class Bird implements IFly{
	//重写方法fly
	@Override
	public void fly() {
		System.out.println("鸟在天上飞");
	}
}
