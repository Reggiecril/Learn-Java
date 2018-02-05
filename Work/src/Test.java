
public class Test {
    public static void main(String[] args) {
		System.out.print("父类信息测试：");
		Work w=new Work("reggie");
		System.out.println(w.work());
		System.out.print("测试工作类信息测试：");
		TestWork tw=new TestWork("reggie",10,20);
		System.out.println(tw.work());
		System.out.print("研发工作类信息测试：");
		DevelopmentWork dw=new DevelopmentWork("reggiecril",40,10);
		System.out.println(dw.work());
	
	}
}
