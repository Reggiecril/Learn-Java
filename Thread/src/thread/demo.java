package thread;

public class demo extends Thread{
	String name;
	demo(String name){
		this.name=name;
	}
	public void run() {
		for(int i=0;i<50;i++)
			System.out.println("threa"+"  "+i);
	}
	
	public static void main(String []args) {
		demo demo1=new demo("Thread1");
		demo1.start();
	}

}
