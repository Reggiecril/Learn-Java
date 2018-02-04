package student;
import student.Subject;
import student.StudentDetail;

public class Student {

	public static void main(String[] args) {
		
		Subject subject= new Subject("计算机科学与应用","J0001",4);
		StudentDetail sd1=new StudentDetail("张三","S01","男",18);
		StudentDetail sd2=new StudentDetail("李四","S02","女",17);
		StudentDetail sd3=new StudentDetail("王五","S03","男",18);

	}

}
