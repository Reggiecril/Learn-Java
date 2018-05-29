
public class Test {
	public static void main(String []args) {
		Ball b=new BallTest() {
			@Override
			public void play() {
				System.out.println("匿名内部类：打排球");
				
			}
		};
		b.play();
		//第一种成员内部类
		BallTest.Inner_m bi=new BallTest().new Inner_m();
		bi.play();
		//第二中成员内部类
		BallTest bt=new BallTest();
		bt.getInner_m();
		//方法内部类
		bt.info();
	}
}
