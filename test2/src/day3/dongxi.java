package day3;

public class dongxi {

	public static void main(String[] args) {
		//��������Ʒ�Ķ��󣬸���Ʒ������
	shop a=new shop();
	shop b=new shop();
	shop c =new shop();
	shop d =new shop();
	shop e =new shop();
	a.setSname("���ӻ�");
	b.setSname("�����");
	c.setSname("�յ�");
	d.setSname("�����");
	e.setSname("�ϳ�");
	
	//�����˳��ж��󣬸����и����֣����ֿ⸳ֵ
	chao m1=new chao();
	m1.setCname("־־");
	m1.setCk(new shop[] {a,b,c,d,e});
	//�����˶��󣬸�ֵ����
	person p=new person();
	p.setRname("����");
	shop result=p.gw(m1,"�ϳ�");//����һ��shop���͵ı�������p.gw���ص�ֵ
	if(result!=null) {//�жϽ���Ƿ�Ϊ�գ���Ϊ�������
		System.out.println(p.getRname()+"��"+m1.getCname()+"����"+result.getSname());
	}//p.getRnameΪperson���͵ı����������һ������
	//m1Ϊchao���͵�һ�����������һ����������
	//resultΪshop���͵�һ�����������һ����Ʒ����
	else {
		System.out.println(p.getRname()+"��"+m1.getCname()+"������һ��");
	}
	}
	
}
