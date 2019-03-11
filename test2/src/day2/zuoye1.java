package day2;

import java.util.Scanner;

public class zuoye1 {
//	public static void main(String[] args) {
//		int [] gjc= {5,6,7,8,9,66};
//		int max=ss(gjc);
//		System.out.println(max);
//	}
//
//	static int ss(int []gjc) {
//		int max=gjc[0];
//		for(int i=0;i<gjc.length;i++) {
//			if(max<gjc[i]) {
//				max=gjc[i];
//			}
//		}return max;
//	}
	public static void main(String[] args) {
		Scanner gg=new Scanner(System.in);
	int []gjc= new int[10];
	for(int i=0;i<gjc.length;i++) {
		
		System.out.println("请输入第"+(i+1)+"个数");
		gjc[i]=gg.nextInt();
	}
	System.out.println("排序前的：");
	ff(gjc);
	ss(gjc);
	System.out.println("排序后的：");
ff(gjc);
}
	static void ss(int []gjc) {
		int g=0;
		for(int i=0;i<gjc.length-1;i++) {
			for(int x=0;x<gjc.length-i-1;x++) {
				if(gjc[x]<gjc[x+1]) {
					g=gjc[x+1];
					gjc[x+1]=gjc[x];
					gjc[x]=g;
				}
			}
		}
	}
	static void ff(int []gjc) {
		for(int i=0;i<gjc.length;i++) {
			System.out.println(gjc[i]);

		}
	}
}

