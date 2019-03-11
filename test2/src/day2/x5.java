package day2;
import java.util.Scanner;
public class x5 {

	
		public static void main(String[] args) {

			int a;
			System.out.println("请输入一个 0~99999 之间的任意数：");
			Scanner b=new Scanner(System.in);
			a=b.nextInt();

			while(true) {
			if(0>a||99999<a) {
				System.out.println("请输入一个 0~99999 之间的任意数：");
				a=b.nextInt();
			}else {
				break;
			}
			}
			int i=0;
			while(a>=0) {
				a/=10;
				i++;
				if(a==0) {
					System.out.println(i);
					break;
				}
			}
			
		}

	}


