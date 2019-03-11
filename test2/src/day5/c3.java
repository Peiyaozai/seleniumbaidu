package day5;
class monkey{
monkey(String s){
		System.out.println(s);
	}
	public void sperk() {
	System.out.println("CNM");
	
	}
}
class people extends monkey{
	people() {
		super("dasdad");
		// TODO Auto-generated constructor stub
	}
	public void sperk() {
		System.out.println("CNM£¬Ìýµ½ÁËÂð£¿CNM");
	}
	public void think() {
		System.out.println("MMP");
	}
}
public class c3 {
	public static void main(String[] args) {
		people s=new people();		
		monkey p=new monkey("sdadsad");
		s.sperk();
		s.think();
		p.sperk();
	}
	}
