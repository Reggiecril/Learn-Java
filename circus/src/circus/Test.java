package circus;
//����scanner
import java.util.Scanner;

public class Test {
	//ѡ�������
	public void enter() {
		System.out.println("************��ӭ����̫����Ϸ��***************");
	    System.out.println("*******��ѡ�������***********");
	    System.out.println("*********   1������   ***************");
	    System.out.println("*********   2��ʨ�� ***************");
	    System.out.println("*********   3������ ***************");
	    System.out.println("*********   4������ ***************");
	    System.out.println("*********   5��С�� ***************");
	    System.out.println("=================================");
		Scanner scan = new Scanner(System.in);
		int enter=scan.nextInt();
		show(enter);
		
	}
	//�ж���������֣����ض�Ӧ�Ľ��
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
			default: System.out.println("����û������ŵı����ߣ�");
					enter();
					break;
		}
		jixu();
		
	}
	//ѡ������ߺ��Ƿ�����ۿ����ж������ֵ��������Ӧ
	public void jixu() {
		System.out.println("*********�Ƿ�����ۿ���1/0��***********");
		Scanner scan = new Scanner(System.in);
		int enter=scan.nextInt();
		if(enter==1) {
			enter();
		}else if(enter==0) {
			System.out.println("***��ӭ�´�����~~***");
			System.exit(-1);
		}else {
			System.out.println("***������Ϣ����ȷ������������~~***");
			jixu();
		}
	}
	public static void main(String[] args) {
		//ʵ��test
		Test t=new Test();
		//���뷽��
		t.enter();

	}

}
