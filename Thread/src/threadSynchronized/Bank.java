package threadSynchronized;

public class Bank {
	int balance;
	String name;
	public Bank(String name,int balance) {
		this.name=name;
		this.balance=balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Bank [balance=" + balance + ", name=" + name + "]";
	}

	public synchronized void saveAccount() {
		
		balance+=100;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setBalance(balance);
		System.out.println("Save:"+balance);
	}
	public  void drawAccount() {
		synchronized(this) {
			int ba=getBalance();
		
		ba-=200;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setBalance(ba);
		System.out.println("Draw:"+balance);
	}
	}
	
}
