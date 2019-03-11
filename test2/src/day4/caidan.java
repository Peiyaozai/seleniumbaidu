package day4;

import java.util.Scanner;

public class caidan {
	static int g;
	static void ss() {
		System.out.println("欢迎使用龚氏银行系统");
	}
	static void sss() {
		String a,b;
		Scanner h=new Scanner(System.in);
		System.out.println("请输入您的用户名：");
		a=h.nextLine();
		System.out.println("请输入您的密码：");
		b=h.nextLine();

	}

	
	static void add() {
		int a;
		Scanner j=new Scanner(System.in);
		System.out.println("请输入您要存储的金额：");	
		a=j.nextInt();
		g=g+a;
		System.out.println("您当前的余额为："+g);
	ll();
	}
	static void app() {
		int a;
		Scanner k=new Scanner(System.in);
		System.out.println("请输入您要取出的金额：");
		a=k.nextInt();
		if(a<g) {
		g=g-a;
			System.out.println("您当前余额为："+g);}
ll();

	}
	
	static void  xuanze(int a) {
		int b;
		Scanner o=new Scanner(System.in);
		switch(a) {
		case 1:
					sss();
					ll();
					System.out.println("请输入序号进行下一步操作：");
					b=o.nextInt();
		case 2: 
					add();
		case 3:
		 			app();
		case 4:
					exit();
					break;
		}
	}
	static void exit() {
		System.out.println("请您携带好随身物品，欢迎下次的光临。");
	}
	static void ll() {
		int a;
		Scanner l=new Scanner(System.in);
		System.out.println("1：开户");
		System.out.println("2：存款");
		System.out.println("3：取款");
		System.out.println("4：退出");
		System.out.println("请输入序号选择您要进行的操作：");
		a=l.nextInt();
		xuanze(a);	
	}
	
}
