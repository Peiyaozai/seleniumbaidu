package day4;

import java.util.Scanner;

public class caidan {
	static int g;
	static void ss() {
		System.out.println("��ӭʹ�ù�������ϵͳ");
	}
	static void sss() {
		String a,b;
		Scanner h=new Scanner(System.in);
		System.out.println("�����������û�����");
		a=h.nextLine();
		System.out.println("�������������룺");
		b=h.nextLine();

	}

	
	static void add() {
		int a;
		Scanner j=new Scanner(System.in);
		System.out.println("��������Ҫ�洢�Ľ�");	
		a=j.nextInt();
		g=g+a;
		System.out.println("����ǰ�����Ϊ��"+g);
	ll();
	}
	static void app() {
		int a;
		Scanner k=new Scanner(System.in);
		System.out.println("��������Ҫȡ���Ľ�");
		a=k.nextInt();
		if(a<g) {
		g=g-a;
			System.out.println("����ǰ���Ϊ��"+g);}
ll();

	}
	
	static void  xuanze(int a) {
		int b;
		Scanner o=new Scanner(System.in);
		switch(a) {
		case 1:
					sss();
					ll();
					System.out.println("��������Ž�����һ��������");
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
		System.out.println("����Я����������Ʒ����ӭ�´εĹ��١�");
	}
	static void ll() {
		int a;
		Scanner l=new Scanner(System.in);
		System.out.println("1������");
		System.out.println("2�����");
		System.out.println("3��ȡ��");
		System.out.println("4���˳�");
		System.out.println("���������ѡ����Ҫ���еĲ�����");
		a=l.nextInt();
		xuanze(a);	
	}
	
}
