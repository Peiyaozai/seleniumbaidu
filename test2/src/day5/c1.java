package day5;
class animal{
	String name;
	void shut() {
		System.out.println("�аְ�");
	}
}
class dog extends animal{
	public void printname() {
		System.out.println("name"+name);
	}
}
public class c1 {
	public static void main(String[] args) {
		dog dog=new dog();
		dog.name="���Ϲ�";
		dog.printname();
		dog.shut();
	}
}
