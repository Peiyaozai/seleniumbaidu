package day3;

public class person {
	private String rname;//����һ����������������
//��װ�ñ�����
	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}
	shop gw(chao sa,String name) {//����chao�࣬saΪchao�����ݣ�name Ϊ�����������Ʒ��
		return sa.sell(name);//����chao���е�sell����
	}
	
}
