public class Test {
    public static void main(String[] args) {
		// ʵ����2��������󣬴���������ͬ�Ĳ���ֵ
		Fruits fr1=new Fruits("circle","nice");
		Fruits fr2=new Fruits("circle","nice");
		// ���ø���eat����
		fr1.eat();

		// ������дequals�������ж����������Ƿ����
		System.out.println("�Ƚϣ�"+fr1.equals(fr2));

	System.out.println("��������������������������������������������������������������������������������");
		// ʵ����������󣬲�������ز���ֵ
		Waxberry wb=new Waxberry("Բ��","��ζ��������","�Ϻ�ɫ");

		// ��������face������eat����
		wb.face();
		wb.eat();

		// ������дtoString�������������������Ϣ
		System.out.println(wb.toString());

		System.out.println("��������������������������������������������������������������������������������������������");
		// ʵ����Banana����󣬲�������ز���ֵ
		Banana b=new Banana("���ζ̶���Բ","��������","���˽�");

		// ���������advantage���������ط���
		b.advantage();
		b.advantage("��ɫ");

	}
}
