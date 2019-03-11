package day5;
class an{
	int chang;
	String name="大佬狗";
	
	void fei() {
		System.out.println("小猪佩奇会飞哟");
	}
}
class zhu extends an{
	
	void f(String name) {
		
	System.out.println("name:"+name+"    chang:"+chang+"老子的名字："+super.name);
	
	}
	void fei() {
		System.out.println("我是一只会飞的老狗");
	}
}
public class c {
	public static void main(String[] args) {
	zhu a=new zhu();
	an b=new an();
	a.chang=45;
	a.f("飞狗");
	a.fei();
	b.fei();
	}
}
