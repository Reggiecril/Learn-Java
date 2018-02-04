package student;

public class StudentDetail {
	private String name;
	private String studentId;
	private String sex;
	private int age;
	StudentDetail(String name,String studentId,String sex,int age){
		this.setName(name);
		this.setStudentId(studentId);
		this.setSex(sex);
		this.setAge(age);
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
	public String message() {
		String message="学生信息如下：\n姓名："+getName()+"\n学号:"+getStudentId()+"\n性别："+getSex()+"\n年龄"+getAge()+"\n===============================";
		return message;
		
	}
}
