package office;
import office.officer;
import office.department;
public class office {
	//��ʼ��typeΪ����
	private static String type="����";
	public static void main(String[] args) {
		//��������department����
		department dep1=new department("�г���");
		department dep2=new department("���²�");
		//����������Ա����
		officer officer1=new officer("����","S001","��",29);
		//���������Ա�����typeΪ����
		officer1.addType(type);
		officer officer2=new officer("���","S002","Ů",21);
		officer officer3=new officer("�ﳬ","S003","��",29);
		officer officer4=new officer("������","S004","Ů",26);
		officer officer5=new officer("����","S005","��",37);
		officer5.addType(type);
		officer officer6=new officer("����","S006","Ů",24);
		
		dep1.addOfficer(officer1);
		dep1.addOfficer(officer2);
		dep1.addOfficer(officer3);
		dep2.addOfficer(officer4);
		dep2.addOfficer(officer5);
		dep2.addOfficer(officer6);
		//���
		System.out.println(dep1.getDepartment()+"�ܹ���"+dep1.getNum()+"��");
		System.out.println(dep2.getDepartment()+"�ܹ���"+dep2.getNum()+"��");
	}

}
