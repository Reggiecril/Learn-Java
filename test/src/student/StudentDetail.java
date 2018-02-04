package student;
/**
 * @author Reggi
 *
 */
public class StudentDetail {
	private String name;
	private String studentId;
	private String sex;
	private int age;
	private Subject subject;
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	StudentDetail(String name,String studentId,String sex,int age,Subject subject){
		this.setName(name);
		this.setStudentId(studentId);
		this.setSex(sex);
		this.setAge(age);
		this.setSubject(subject);
		System.out.println(message());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * ����Ϣ����String message���棬�ڹ��췽���������
	 * @parm message
	 * @return
	 */
	public String message() {
		String message="ѧ����Ϣ���£�\n������"+getName()+"\nѧ��:"+getStudentId()+"\n�Ա�"+getSex()+"\n����"+getAge()+"\nѧ��"+subject.getSubjectId()+"\n��Ŀ����"+subject.getSubjectName()+"\n===============================";
		return message;
		
	}
}
