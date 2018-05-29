package Fly;

public class Test {
	
	public static void main(String [] args) {
		
		//ÊµÀý
		IFly if1=new Bird();
		if1.fly();
		IFly if2=new Balloon();
		if2.fly();
		IFly if3=new Panel();
		if3.fly();
	}
	
}
