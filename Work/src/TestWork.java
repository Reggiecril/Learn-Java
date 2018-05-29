
public class TestWork extends Work{
    //属性：编写的测试用例个数、发现的Bug数量
	private int testNum;
	private int testBug;
    // 编写构造方法，并调用父类相关赋值方法，完成属性赋值
	public TestWork() {
		
	}
	public TestWork(String name,int testNum,int testBug) {
		this.setName(name);
		this.setTestBug(testBug);
		this.setTestNum(testNum);
	}
    // 公有的get***/set***方法完成属性封装

	public int getTestNum() {
		return testNum;
	}
	public void setTestNum(int testNum) {
		this.testNum = testNum;
	}
	public int getTestBug() {
		return testBug;
	}
	public void setTestBug(int testBug) {
		this.testBug = testBug;
	}
	// 重写运行方法，描述内容为：**的日报是：今天编写了**个测试用例，发现了**bug。其中**的数据由属性提供
	public String work() {
		return this.getName()+this.getTestNum()+""+this.getTestBug();
        
	}
}
