package day6;
abstract class animal {
	abstract public void shut() ;
	
}
class cat extends animal{
	public void shut() {
		System.out.println("è����");
	}
}
class dog extends animal{
	public void shut() {
		System.out.println("����ʺ");
	}
}
public class m1 {
	public static void main(String[] args) {
		cat a=new cat();
		dog b=new dog();
		a.shut();
		b.shut();
	}
}
    