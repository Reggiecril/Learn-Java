package test;
//����scanner ��
import java.util.Scanner;

public class main {
	//��ʼ��array r
	int[]r= new int[10];
	 Scanner s= new Scanner(System.in);
	 //�������� insertDate(),aΪarray��iΪ�����ֵ��indexΪ�����ֵ��λ��;
	public int[] insertDate(int []a,int i,int index) {
			
			int[]d= a;
			d[index]=i;
			for(int w:d) {
				System.out.println(w);
			}
		return d;
	}
	//��������insert()
	public void insert() {
		for(int i=1;i<r.length+1;i++) {
			
 			System.out.println("�������"+i+"������(o for exit)");
 			int a=s.nextInt();
 			if(a!=0) {
 				//���÷���insertDate��������ʹ����returnֵ��ֵ��r
 				r=insertDate(r, a,i-1);
 			}else {
 				System.out.println("Exited");
 				break;
 			}
 			
 			
			}
	}
	//��������display()
	public void display() {
		//ѭ��r����r��=0�����
		for(int e:r) {
			if(e!=0) {
			System.out.print(e+" ");
			}
		}
		System.out.println("");
	}
	//��������merge()
	public int[] merge(int p,int n) {
		int position=p;
		int number=n;
		//�Ӻ���ǰ��ʹarray�У���ָ��ֵ�ĺ��棬���λ�ֵ��
		for(int i=0;i<r.length-1;i++) {
			int w=r.length-1-i;
				if(w>position) {
					r[w]=r[w-1];
				}
			
				
				
		}
		r[position]=number;
		return r;
		
	}
	public void divThree(){
		//ѭ���Ѵ��ڵ�array r������rÿ����ֵ������
		for(int e:r) {
			if(e%3==0 && e!=0) {
				System.out.print(e);
				
			}
		}
		System.out.println("");
		
	}
	//��������mai'n()
	 public void main() {
		 System.out.println("********************************************");
		 System.out.println("1--��������");
		 System.out.println("2--��ʾ��������");
		 System.out.println("3--��ָ��λ�ô���������");
		 System.out.println("4--��ѯ�ܱ�3����������");
		 System.out.println("0--�˳�");
		 System.out.println("********************************************");

		 int n=s.nextInt();
		 //�ж�n
		 switch(n) {
		 	//��n==1
		 	case 1:
		 		
		 			insert();
		 			//�ڽ���insert���������µ���main()����
		 			main();
		 	//��n==2
			case 2:
					display();
					main();
			//��n==3
			case 3:
				System.out.println("���������λ��");
				int position=s.nextInt();
				System.out.println("�������������");
				int number=s.nextInt();
				merge(position,number);
				main();
			//��n==4
			case 4:
					divThree();
					main();
			//��n==5
			case 5:
				System.out.println("System was exited!");
				System.exit(0);
				
		 }
		
	 }
	public static void main(String [] args) {
	
		main m = new main();
		//���÷���main()�������������
		m.main();
	}
}