package thread;

public class runnableDemo implements Runnable{
	String name;
	runnableDemo(String name){
		this.name=name;
	}

	@Override
	public void run() {
		for(int i=0;i<30;i++) {
			System.out.println(name+":"+i);
		
		}
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		
		
		runnableDemo demo=new runnableDemo("Thread1");
		Thread t1=new Thread(demo);
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		try {
			//放在第一位
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		runnableDemo demo1=new runnableDemo("Thread2");
		Thread t2=new Thread(demo1);
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		try {
			//放在1ms后
			t2.join(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//主线程
		for(int i=0;i<500;i++) {
			System.out.println("main thread:"+i);
		}

	}
}
