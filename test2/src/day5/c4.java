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
		System.out.println("姓名："+this.name+"性别："+this.sex+"年龄："+this.age);
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
		System.out.println("专业："+this.speciallity+"指导老师："+this.teacher);
	}
}
public class c4 {
	public static void main(String[] age) {
		student b=new student("凉凉","女",18);
		student k=new student("梁梁","男",20);
		b.setAge(b.getAge()+1);
		k.setAge(b.getAge()+1);
			
			
			if(b.getAge()<20) {
				b.outInfo();
				setschool("先锋");
			}
			if(k.getAge()<20) {
				k.outInfo();
				setschool("先锋");
			}
			
		
	}
	static void setschool(String school) {
		System.out.println("毕业学校："+school);
		
	}
	
}
