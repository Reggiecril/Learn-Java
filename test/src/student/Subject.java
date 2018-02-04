package student;

public class Subject {
	private String subjectName;
	private String subjectId;
	private int subjectYear;
	Subject(String subjectName,String subjectId,int subjectYear){
		this.setSubjectName(subjectName);
		this.setSubjectId(subjectId);
		this.setSubjectYear(subjectYear);
		System.out.println(message());
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	public int getSubjectYear() {
		return subjectYear;
	}
	public void setSubjectYear(int subjectYear) {
		this.subjectYear = subjectYear;
	}
	public String message() {
		String message="专业信息如下：\n"+"专业名称："+getSubjectName()+"\n专业编号："+getSubjectId()+"\n专业学年："+getSubjectYear()+"\n================================================";
		return message;
	}
	
}
