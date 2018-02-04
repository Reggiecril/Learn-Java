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
	
	/**将从对象中的取值封装输出。
	 * @param name
	 * @param studentId
	 * @param sex
	 * @param age
	 * @param subject
	 */
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
	 * 将信息放在String message里面，在构造方法中输出。
	 * @parm message
	 * @return
	 */
	public String message() {
		String message="学生信息如下：\n姓名："+getName()+"\n学号:"+getStudentId()+"\n性别："+getSex()+"\n年龄"+getAge()+"\n学编"+subject.getSubjectId()+"\n科目名称"+subject.getSubjectName()+"\n===============================";
		return message;
		
	}
}
