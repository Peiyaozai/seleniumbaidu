package day4;
class ss{
	static String gjc;
	int c=0;
	public static void speak() {
		System.out.println("����Ӵ���о������������۷壬�о����������˸߳���");
	}
}
public class stati {
 
	public static void main(String[] args) {
		ss s1=new ss();
		ss s2=new ss();
		ss.gjc="����Ӵ���о������������۷壬�о����������˸߳���";
		s1.c=123456;
		s2.c=456123;
		//System.out.println("s1.gjc="+ss.gjc+"      s1.c="+s1.c);
		//System.out.println("s2.gjc="+ss.gjc+"      s2.c="+s2.c);
		ss.speak();
	}
}
