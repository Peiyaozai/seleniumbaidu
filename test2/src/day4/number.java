package day4;

public class number {
private int n1;
private int n2;
		public number(int a,int b){
			n1=a;
			n2=b;
		}
	
	public  void  add() {
		
		System.out.println("�ӣ�"+(n1+n2));
	}
	public void  jian() {
		
		System.out.println("����"+(n1-n2));
	}
	public void  cheng() {
		
		System.out.println("�ˣ�"+(n1*n2));
	}
	public void  chu() {
		
		System.out.println("����"+(n1/n2));
	}
}
