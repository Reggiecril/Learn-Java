
public class DevelopmentWork extends Work{
    // ���ԣ���Ч����������Ŀǰû�н����Bug����
	private int row;
	private int bugs;
	//��д���췽���������ø�����ظ�ֵ������������Ը�ֵ
	public DevelopmentWork() {
		
	}
	public DevelopmentWork(String name,int row,int bugs) {
		this.setName(name);
		this.setBugs(bugs);
		this.setRow(row);
	}
    // ���е�get***/set***����������Է�װ
	
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
	// ��д���з�������������Ϊ��**���ձ��ǣ������д��**�д��룬Ŀǰ��Ȼ��**��bugû�н��������**�������������ṩ
	public String work() {
		return this.getName()+"  "+this.getRow()+" "+this.getBugs();
        
	}
}
