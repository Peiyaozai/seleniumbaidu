package day5;
class an{
	int chang;
	String name="���й�";
	
	void fei() {
		System.out.println("С��������Ӵ");
	}
}
class zhu extends an{
	
	void f(String name) {
		
	System.out.println("name:"+name+"    chang:"+chang+"���ӵ����֣�"+super.name);
	
	}
	void fei() {
		System.out.println("����һֻ��ɵ��Ϲ�");
	}
}
public class c {
	public static void main(String[] args) {
	zhu a=new zhu();
	an b=new an();
	a.chang=45;
	a.f("�ɹ�");
	a.fei();
	b.fei();
	}
}
