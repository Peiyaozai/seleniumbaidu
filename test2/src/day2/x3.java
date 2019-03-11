package day2;
import java.util.Scanner;
public class x3 {
	

	
		public static void main(String[] args) {
			int a;
			System.out.print("输入一个整数：");
			Scanner b=new Scanner(System.in);
			a=b.nextInt();
			int c;
			
			
				if(a>=0) {
					if(a>0){
						while(a!=0) {
						c=a%10;
						a/=10;
						System.out.print(c);
						}	
					}else {
						System.out.print(a);
					}		
				}
				
				else {
					while(a!=0) {
						c=(-a)%10;
						a=(a)/10;
						System.out.print(c);
					}
					
				}	
				
				
		}
	}


