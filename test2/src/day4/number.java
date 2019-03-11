package day4;

public class number {
private int n1;
private int n2;
		public number(int a,int b){
			n1=a;
			n2=b;
		}
	
	public  void  add() {
		
		System.out.println("¼Ó£º"+(n1+n2));
	}
	public void  jian() {
		
		System.out.println("¼õ£º"+(n1-n2));
	}
	public void  cheng() {
		
		System.out.println("³Ë£º"+(n1*n2));
	}
	public void  chu() {
		
		System.out.println("³ý£º"+(n1/n2));
	}
}
