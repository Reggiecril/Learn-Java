
public class Test {

	public static void main(String[] args) {
		NonMoter nm=new NonMoter("红色","天宇牌",4,2);
		System.out.println(nm.message());
		Bicycle bc=new Bicycle("黄色","捷安特","自行车");
		System.out.println(bc.message());
		ElectricVehicle ev=new ElectricVehicle("飞鸽牌","电动车");
		System.out.println(ev.message());
		Tricycle tc=new Tricycle(3,"非机动车");
		System.out.println(tc.message());
	}

}
