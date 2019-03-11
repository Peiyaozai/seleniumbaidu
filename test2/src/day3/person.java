package day3;

public class person {
	private String rname;//定义一个变量，接收人名
//封装该变量名
	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}
	shop gw(chao sa,String name) {//调用chao类，sa为chao类数据，name 为自行输入的商品名
		return sa.sell(name);//调用chao类中的sell方法
	}
	
}
