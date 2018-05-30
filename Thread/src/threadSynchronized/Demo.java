package threadSynchronized;

public class Demo {
	
	public static void main(String []args) {
		Bank bank=new Bank("1001",1000);
		SaveAccount saveAccount=new SaveAccount(bank);
		DrawAccount drawAccount=new DrawAccount(bank);
		Thread t1=new Thread(saveAccount);
		Thread t2=new Thread(drawAccount);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
