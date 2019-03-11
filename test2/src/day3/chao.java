package day3;

public class chao {
	shop a=new shop();//链接商品名称类
	private String cname;//定义一个变量作为超市名称的接收；
	private shop[] ck;//定义一个由商品名称类为类型的数组来接收多个商品名称
	//封装变量
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public shop[] getCk() {
		return ck;
	}
	public void setCk(shop[] ck) {
		this.ck = ck;
	}
	shop sell(String name) {//定义一个方法为shop类型，参数为最后输入的商品名称
		for(int i=0;i<ck.length;i++) {//循环判断
			if(ck[i].getSname()==name) {//判断接收的商品名称在ck数组里是否有该商品
				return ck[i];//返回该商品
			}
			
		}
		return null;//没有返回无
	}
}
