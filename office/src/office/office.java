package office;
import office.officer;
import office.department;
public class office {
	//初始化type为经理
	private static String type="经理";
	public static void main(String[] args) {
		//定义两个department对象
		department dep1=new department("市场部");
		department dep2=new department("人事部");
		//定义两个成员对象
		officer officer1=new officer("张铭","S001","男",29);
		//定义这个成员对象的type为经理
		officer1.addType(type);
		officer officer2=new officer("李艾爱","S002","女",21);
		officer officer3=new officer("孙超","S003","男",29);
		officer officer4=new officer("张美美","S004","女",26);
		officer officer5=new officer("蓝迪","S005","男",37);
		officer5.addType(type);
		officer officer6=new officer("米利","S006","女",24);
		
		dep1.addOfficer(officer1);
		dep1.addOfficer(officer2);
		dep1.addOfficer(officer3);
		dep2.addOfficer(officer4);
		dep2.addOfficer(officer5);
		dep2.addOfficer(officer6);
		//输出
		System.out.println(dep1.getDepartment()+"总共有"+dep1.getNum()+"人");
		System.out.println(dep2.getDepartment()+"总共有"+dep2.getNum()+"人");
	}

}
