package day3;

import java.util.Scanner;

public class t06 {
	int height;
	String name;
	int age;
	String sex;
	
	public int getHeight() {
		return height;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getRename() {
		return sex;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setRename(String sex) {
		
		this.sex = sex;
	}
	void cs() {
		
		System.out.println("��ã��ҽ�"+name+"�ҽ���"+age+"�꣬�����"+height+"�Ա�"+sex+"���ܸ�����ʶ�㣬���Ҹ����ӣ����Ҷ��Ӱɣ�");
		Scanner k=new Scanner(System.in);
		int c;
	
		System.out.println("�Ƿ���Ҫ������1����Ҫ��2������Ҫ");
		c=k.nextInt();
		String h;
		if(c==1) {
			System.out.println("�������������ƣ�");
			Scanner l =new Scanner(System.in);
			h=l.nextLine();
			setName(h);
			System.out.println("��ã��ҽ�"+name+"�ҽ���"+age+"�꣬�����"+height+"�Ա�"+sex+"���ܸ�����ʶ�㣬���Ҹ����ӣ����Ҷ��Ӱɣ�");
			}
		else if(c==2) {
			System.out.println("��ã��ҽ�"+name+"�ҽ���"+age+"�꣬�����"+height+"�Ա�"+sex+"���ܸ�����ʶ�㣬���Ҹ����ӣ����Ҷ��Ӱɣ�");
		}
	}
	
	
}
