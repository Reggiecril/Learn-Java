
public class Test {
    public static void main(String[] args) {
		System.out.print("������Ϣ���ԣ�");
		Work w=new Work("reggie");
		System.out.println(w.work());
		System.out.print("���Թ�������Ϣ���ԣ�");
		TestWork tw=new TestWork("reggie",10,20);
		System.out.println(tw.work());
		System.out.print("�з���������Ϣ���ԣ�");
		DevelopmentWork dw=new DevelopmentWork("reggiecril",40,10);
		System.out.println(dw.work());
	
	}
}
