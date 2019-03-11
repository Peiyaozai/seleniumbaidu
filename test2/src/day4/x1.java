package day4;

public class x1 {
	int age;
	int h;
	public x1(int a) {
		age=a;
		System.out.println("享龄："+age+"年");
	}
	public x1(int a,int b) {
		age = a;
		h=b;
		System.out.println("长："+age+"cm"+"体重为："+h+"kg");
	}
	public x1() {
	
		System.out.println("这是一只死猫");
	}

}
