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
			System.out.println("������˼������������䲻�Ϸ�");
		}
		else {
		this.length = length;
	}
	}


	public void setName(String name) {
		this.name = name;
	}
	public void speak() {
		System.out.println("�ҽ�"+name+"����"+length);
	}

}
