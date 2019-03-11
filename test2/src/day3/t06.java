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
		
		System.out.println("你好，我叫"+name+"我今年"+age+"岁，我身高"+height+"性别"+sex+"，很高兴认识你，给我个面子，做我儿子吧！");
		Scanner k=new Scanner(System.in);
		int c;
	
		System.out.println("是否需要改名：1：需要；2：不需要");
		c=k.nextInt();
		String h;
		if(c==1) {
			System.out.println("请输入您的名称：");
			Scanner l =new Scanner(System.in);
			h=l.nextLine();
			setName(h);
			System.out.println("你好，我叫"+name+"我今年"+age+"岁，我身高"+height+"性别"+sex+"，很高兴认识你，给我个面子，做我儿子吧！");
			}
		else if(c==2) {
			System.out.println("你好，我叫"+name+"我今年"+age+"岁，我身高"+height+"性别"+sex+"，很高兴认识你，给我个面子，做我儿子吧！");
		}
	}
	
	
}
