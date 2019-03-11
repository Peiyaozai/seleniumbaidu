package day3;

public class t01 {
	int length;
	String name;
	
	
	public int getLength() {
		return length;
	}
	public String getName() {
		return name;
	}


	public void setLength(int length) {
		if(length<=0) {
			System.out.println("不好意思，您输入的年龄不合法");
		}
		else {
		this.length = length;
	}
	}


	public void setName(String name) {
		this.name = name;
	}
	public void speak() {
		System.out.println("我叫"+name+"今年"+length);
	}

}
