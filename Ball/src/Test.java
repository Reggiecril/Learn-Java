
public class Test {
	public static void main(String []args) {
		Ball b=new BallTest() {
			@Override
			public void play() {
				System.out.println("�����ڲ��ࣺ������");
				
			}
		};
		b.play();
		//��һ�ֳ�Ա�ڲ���
		BallTest.Inner_m bi=new BallTest().new Inner_m();
		bi.play();
		//�ڶ��г�Ա�ڲ���
		BallTest bt=new BallTest();
		bt.getInner_m();
		//�����ڲ���
		bt.info();
	}
}
