public class Test {
    public static void main(String[] args) {
		// 实例化2个父类对象，传入两组相同的参数值
		Fruits fr1=new Fruits("circle","nice");
		Fruits fr2=new Fruits("circle","nice");
		// 调用父类eat方法
		fr1.eat();

		// 测试重写equals方法，判断两个对象是否相等
		System.out.println("比较："+fr1.equals(fr2));

	System.out.println("————————————————————————————————————————");
		// 实例化子类对象，并传入相关参数值
		Waxberry wb=new Waxberry("圆形","果味酸甜适中","紫红色");

		// 调用子类face方法和eat方法
		wb.face();
		wb.eat();

		// 测试重写toString方法，输出子类对象的信息
		System.out.println(wb.toString());

		System.out.println("——————————————————————————————————————————————");
		// 实例化Banana类对象，并传入相关参数值
		Banana b=new Banana("果形短而稍圆","果肉香甜","仙人焦");

		// 调用子类的advantage和它的重载方法
		b.advantage();
		b.advantage("黄色");

	}
}
