package office;

public class officer {
	private String name;
	private String workId;
	private String sex;
	private String type;
	/**
	 * Ĭ��typeΪ����
	 * @return
	 */
	public String getType() {
		if(type==null)
		type="����";
		return type;
	}
	public void setType(String type) {
		
		this.type = type;
	}
	/**
	 * ����type����Ա������
	 * @param type
	 */
	public void addType(String type) {
		this.setType(type);
	}
	private int age;
	private department dep;
	public department getDep() {
		return dep;
	}
	public void setDep(department dep) {
		this.dep = dep;
	}
	officer(){
		
	}
	officer(String name,String workId,String sex,int age){
		 this.setName(name);
		 this.setWorkId(workId);
		 this.setSex(sex);
		 this.setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWorkId() {
		return workId;
	}
	public void setWorkId(String workId) {
		this.workId = workId;
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
}
