package student;
import student.Subject;
import student.StudentDetail;

public class Student {

	public static void main(String[] args) {
		
		Subject subject= new Subject("�������ѧ��Ӧ��","J0001",4);
		StudentDetail sd1=new StudentDetail("����","S01","��",18,subject);
		StudentDetail sd2=new StudentDetail("����","S02","Ů",17,subject);
		StudentDetail sd3=new StudentDetail("����","S03","��",18,subject);

	}

}
