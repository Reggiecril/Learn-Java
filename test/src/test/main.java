package test;
//调用scanner 包
import java.util.Scanner;

public class main {
	//初始化array r
	int[]r= new int[10];
	 Scanner s= new Scanner(System.in);
	 //命名方法 insertDate(),a为array，i为输入的值，index为输入的值的位置;
	public int[] insertDate(int []a,int i,int index) {
			
			int[]d= a;
			d[index]=i;
			for(int w:d) {
				System.out.println(w);
			}
		return d;
	}
	//命名方法insert()
	public void insert() {
		for(int i=1;i<r.length+1;i++) {
			
 			System.out.println("请输入第"+i+"个数字(o for exit)");
 			int a=s.nextInt();
 			if(a!=0) {
 				//调用方法insertDate（），并使它的return值赋值到r
 				r=insertDate(r, a,i-1);
 			}else {
 				System.out.println("Exited");
 				break;
 			}
 			
 			
			}
	}
	//命名方法display()
	public void display() {
		//循环r，当r！=0，输出
		for(int e:r) {
			if(e!=0) {
			System.out.print(e+" ");
			}
		}
		System.out.println("");
	}
	//命名方法merge()
	public int[] merge(int p,int n) {
		int position=p;
		int number=n;
		//从后往前，使array中，被指定值的后面，依次换值。
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
		//循环已存在的array r，计算r每个数值的余数
		for(int e:r) {
			if(e%3==0 && e!=0) {
				System.out.print(e);
				
			}
		}
		System.out.println("");
		
	}
	//命名方法mai'n()
	 public void main() {
		 System.out.println("********************************************");
		 System.out.println("1--插入数据");
		 System.out.println("2--显示所有数据");
		 System.out.println("3--在指定位置处插入数据");
		 System.out.println("4--查询能被3整除的数据");
		 System.out.println("0--退出");
		 System.out.println("********************************************");

		 int n=s.nextInt();
		 //判读n
		 switch(n) {
		 	//当n==1
		 	case 1:
		 		
		 			insert();
		 			//在结束insert方法后，重新调用main()方法
		 			main();
		 	//当n==2
			case 2:
					display();
					main();
			//当n==3
			case 3:
				System.out.println("请输入插入位置");
				int position=s.nextInt();
				System.out.println("请输入插入数字");
				int number=s.nextInt();
				merge(position,number);
				main();
			//当n==4
			case 4:
					divThree();
					main();
			//当n==5
			case 5:
				System.out.println("System was exited!");
				System.exit(0);
				
		 }
		
	 }
	public static void main(String [] args) {
	
		main m = new main();
		//调用方法main()到主方法，输出
		m.main();
	}
}
