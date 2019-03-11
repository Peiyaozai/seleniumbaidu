package day2;

public class x1 {
	
		public static void main(String[] args) {
			int a=0,b=5,c=1,d=6,e;
			
			for(int i=1;i<=3;i++) {
				if(a<b) {
					e=a;
					a=b;
					b=e;
				}
				if(b<c) {
					e=b;
					b=c;
					c=e;
				}
				if(c<d) {
					e=c;
					c=d;
					d=e;
				}
			}

			System.out.println(a+"  "+b+"  "+c+"  "+d);
		}
		
	}

