
public class TestWork extends Work{
    //���ԣ���д�Ĳ����������������ֵ�Bug����
	private int testNum;
	private int testBug;
    // ��д���췽���������ø�����ظ�ֵ������������Ը�ֵ
	public TestWork() {
		
	}
	public TestWork(String name,int testNum,int testBug) {
		this.setName(name);
		this.setTestBug(testBug);
		this.setTestNum(testNum);
	}
    // ���е�get***/set***����������Է�װ

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
	// ��д���з�������������Ϊ��**���ձ��ǣ������д��**������������������**bug������**�������������ṩ
	public String work() {
		return this.getName()+this.getTestNum()+""+this.getTestBug();
        
	}
}
