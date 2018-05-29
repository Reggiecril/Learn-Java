package circus;
//调入scanner
import java.util.Scanner;

public class Test {
	//选择表演者
	public void enter() {
		System.out.println("************欢迎来到太阳马戏团***************");
	    System.out.println("*******请选择表演者***********");
	    System.out.println("*********   1、棕熊   ***************");
	    System.out.println("*********   2、狮子 ***************");
	    System.out.println("*********   3、猴子 ***************");
	    System.out.println("*********   4、鹦鹉 ***************");
	    System.out.println("*********   5、小丑 ***************");
	    System.out.println("=================================");
		Scanner scan = new Scanner(System.in);
		int enter=scan.nextInt();
		show(enter);
		
	}
	//判读输入的数字，返回对应的结果
	public void show(int num) {
		Animal animal1;
		switch (num) {
			case 1: animal1=new Bear();
					animal1.desciption();
					break;
			case 2: animal1=new Lion();
					animal1.desciption();
					break;
			case 3: animal1=new Monkey();
					animal1.desciption();
					break;
			case 4: animal1=new Parrot();
					animal1.desciption();
					break;
			case 5: animal1=new Clown();
					animal1.desciption();
					break;
			default: System.out.println("我们没有这个号的表演者！");
					enter();
					break;
		}
		jixu();
		
	}
	//选择表演者后是否继续观看，判断输入的值并做出反应
	public void jixu() {
		System.out.println("*********是否继续观看（1/0）***********");
		Scanner scan = new Scanner(System.in);
		int enter=scan.nextInt();
		if(enter==1) {
			enter();
		}else if(enter==0) {
			System.out.println("***欢迎下次再来~~***");
			System.exit(-1);
		}else {
			System.out.println("***输入信息不正确，请重新输入~~***");
			jixu();
		}
	}
	public static void main(String[] args) {
		//实例test
		Test t=new Test();
		//调入方法
		t.enter();

	}

}
