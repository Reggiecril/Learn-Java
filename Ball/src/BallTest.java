
public class BallTest implements Ball{
	//�ⲿ���age
	int age=19;
	//ʵ��Inner_m
	public Inner_m getInner_m() {
		int a=new Inner_m().age;
		return new Inner_m();
	}
	//��Ա�ڲ���
	public class Inner_m implements Ball{
		//��Ա�ڲ����age
		int age=29;
		@Override
		public void play() {
			System.out.println(BallTest.this.age+"��Ա�ڲ��ࣺ������");
		}
		
	}
	//�����ڲ���
	public void info() {
		class Inner_f implements Ball{

			@Override
			public void play() {
				System.out.println("**********�����ڲ���:��ƹ����");
				
			}
			
		}
		//ʵ��Inner_fȡplay������
		new Inner_f().play();
	}
	public void playBall(Ball ball) {
		
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

}
