package day2;

import java.util.Scanner;

public class x2 {
	public static void main(String[] args) {
int e,f,g;
System.out.println("请输入年月日:");
Scanner c = new Scanner(System.in);
Scanner b = new Scanner(System.in);
Scanner d = new Scanner(System.in);

	e=c.nextInt();
	f=b.nextInt();
	g=d.nextInt();
	int sum=0;
	if(e%4==0) {
		for(int i=1;i<f&&f<=12;i++)
		{
			switch(i) {
			case 1: case 3: case 5 : case 7: case 8: case 10: case 12:
				sum=sum+31;
				break;
			case 4: case 6: case 9 : case 11: 
				sum=sum+30;
				break;
			case 2:
				sum=sum+29;
				break;
				default:System.out.println("没有这个月份");
				break;
			}
		}
		
		sum=sum+g;
		System.out.println(e+"年"+f+"月"+g+"日"+"是"+e+"年的第"+sum+"天");
	}
	else {
		for(int i=1;i<f&&f<=12;i++)
		{
			switch(i) {
			case 1: case 3: case 5 : case 7: case 8: case 10: case 12:
				sum=sum+31;
				break;
			case 4: case 6: case 9 : case 11: 
				sum=sum+30;
				break;
			case 2:
				sum=sum+28;
				break;
			default:System.out.println("没有这个月份");
			break;
			}
		}sum=sum+g;
		System.out.println(e+"年"+f+"月"+g+"日"+"是"+e+"年的第"+sum+"天");
	}

}
}

