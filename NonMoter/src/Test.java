
public class Test {

	public static void main(String[] args) {
		NonMoter nm=new NonMoter("��ɫ","������",4,2);
		System.out.println(nm.message());
		Bicycle bc=new Bicycle("��ɫ","�ݰ���","���г�");
		System.out.println(bc.message());
		ElectricVehicle ev=new ElectricVehicle("�ɸ���","�綯��");
		System.out.println(ev.message());
		Tricycle tc=new Tricycle(3,"�ǻ�����");
		System.out.println(tc.message());
	}

}
