package day5;
class student{
	
	private String name;
	private String sex;
	private int age;
	public student() {
		
	}
	public  student(String name,String sex,int age){
this.name=name;
this.sex=sex;
this.age=age;

		}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public 	int getAge() {
		return this.age;
	}
	public void outInfo() {
		System.out.println("������"+this.name+"�Ա�"+this.sex+"���䣺"+this.age);
	}
}
class graduatestudent extends student{
	String speciallity;
	String teacher;
	public  graduatestudent(String name,String sex,int age,String speciallity,String teacher) {
		super(name,sex,age);
		
	}
	public void outInfo() {
		super.outInfo();
		System.out.println("רҵ��"+this.speciallity+"ָ����ʦ��"+this.teacher);
	}
}
public class c4 {
	public static void main(String[] age) {
		student b=new student("����","Ů",18);
		student k=new student("����","��",20);
		b.setAge(b.getAge()+1);
		k.setAge(b.getAge()+1);
			
			
			if(b.getAge()<20) {
				b.outInfo();
				setschool("�ȷ�");
			}
			if(k.getAge()<20) {
				k.outInfo();
				setschool("�ȷ�");
			}
			
		
	}
	static void setschool(String school) {
		System.out.println("��ҵѧУ��"+school);
		
	}
	
}
