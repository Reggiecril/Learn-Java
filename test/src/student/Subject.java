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
		String message="רҵ��Ϣ���£�\n"+"רҵ���ƣ�"+getSubjectName()+"\nרҵ��ţ�"+getSubjectId()+"\nרҵѧ�꣺"+getSubjectYear()+"\n================================================";
		return message;
	}
	
}
