package day3;

public class dongxi {

	public static void main(String[] args) {
		//创建了商品的对象，给商品赋名字
	shop a=new shop();
	shop b=new shop();
	shop c =new shop();
	shop d =new shop();
	shop e =new shop();
	a.setSname("电视机");
	b.setSname("电冰箱");
	c.setSname("空调");
	d.setSname("吹风机");
	e.setSname("诚诚");
	
	//创建了超市对象，给超市赋名字，给仓库赋值
	chao m1=new chao();
	m1.setCname("志志");
	m1.setCk(new shop[] {a,b,c,d,e});
	//创建人对象，赋值人名
	person p=new person();
	p.setRname("梁梁");
	shop result=p.gw(m1,"诚诚");//定义一个shop类型的变量接收p.gw返回的值
	if(result!=null) {//判断结果是否为空，不为空则输出
		System.out.println(p.getRname()+"在"+m1.getCname()+"买到了"+result.getSname());
	}//p.getRname为person类型的变量，则就是一个人名
	//m1为chao类型的一个变量则就是一个超市名称
	//result为shop类型的一个变量则就是一个商品名称
	else {
		System.out.println(p.getRname()+"在"+m1.getCname()+"白跑了一趟");
	}
	}
	
}
