
public class DevelopmentWork extends Work{
    // 属性：有效编码行数、目前没有解决的Bug个数
	private int row;
	private int bugs;
	//编写构造方法，并调用父类相关赋值方法，完成属性赋值
	public DevelopmentWork() {
		
	}
	public DevelopmentWork(String name,int row,int bugs) {
		this.setName(name);
		this.setBugs(bugs);
		this.setRow(row);
	}
    // 公有的get***/set***方法完成属性封装
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getBugs() {
		return bugs;
	}
	public void setBugs(int bugs) {
		this.bugs = bugs;
	}
	// 重写运行方法，描述内容为：**的日报是：今天编写了**行代码，目前仍然有**个bug没有解决。其中**的数据由属性提供
	public String work() {
		return this.getName()+"  "+this.getRow()+" "+this.getBugs();
        
	}
}
