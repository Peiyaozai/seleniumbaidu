package day3;

public class chao {
	shop a=new shop();//������Ʒ������
	private String cname;//����һ��������Ϊ�������ƵĽ��գ�
	private shop[] ck;//����һ������Ʒ������Ϊ���͵����������ն����Ʒ����
	//��װ����
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public shop[] getCk() {
		return ck;
	}
	public void setCk(shop[] ck) {
		this.ck = ck;
	}
	shop sell(String name) {//����һ������Ϊshop���ͣ�����Ϊ����������Ʒ����
		for(int i=0;i<ck.length;i++) {//ѭ���ж�
			if(ck[i].getSname()==name) {//�жϽ��յ���Ʒ������ck�������Ƿ��и���Ʒ
				return ck[i];//���ظ���Ʒ
			}
			
		}
		return null;//û�з�����
	}
}
