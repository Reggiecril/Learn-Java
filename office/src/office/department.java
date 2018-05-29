package office;

public class department {
	private String department;
	private officer[] of;
	private int num;
	department(){
		
	}
	department(String department){
		this.setDepartment(department);
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public officer[] getOf() {
		if(this.of==null)
		this.of=new officer[100];
		return of;
	}
	public void setOf(officer[] of) {
		this.of = of;
	}	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void addOfficer(officer office) {
		for(int i=0;i<this.getOf().length;i++) {
		if(this.getOf()[i]==null) {
			office.setDep(this);
			this.getOf()[i]=office;
			num=i+1;
			setNum(num);
			System.out.println("姓名："+office.getName()+"\n工号："+office.getWorkId()+"\n性别："+office.getSex()+"\n年龄："+office.getAge()+"\n职务："+this.getDepartment()+office.getType()
			+"\n===========================");
			break;
		}
		}
		
	}

}
