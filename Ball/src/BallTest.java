
public class BallTest implements Ball{
	//外部类的age
	int age=19;
	//实例Inner_m
	public Inner_m getInner_m() {
		int a=new Inner_m().age;
		return new Inner_m();
	}
	//成员内部类
	public class Inner_m implements Ball{
		//成员内部类的age
		int age=29;
		@Override
		public void play() {
			System.out.println(BallTest.this.age+"成员内部类：打篮球");
		}
		
	}
	//方法内部类
	public void info() {
		class Inner_f implements Ball{

			@Override
			public void play() {
				System.out.println("**********方法内部类:打乒乓球");
				
			}
			
		}
		//实例Inner_f取play（）；
		new Inner_f().play();
	}
	public void playBall(Ball ball) {
		
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

}
