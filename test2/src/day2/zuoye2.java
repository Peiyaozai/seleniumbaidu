package day2;

import java.util.Scanner;

public class zuoye2 {
	public static void main(String[] args) {
		System.out.println("1.查询");
		System.out.println("2.获取当前月份的星座时运");
		Scanner g=new Scanner(System.in);
		int p=g.nextInt();
		switch(p) {
		case 1: select();break;
		case 2: jj();break;
		default:
			System.out.println("输入序号有误");
			
			
		}
	}
	static void select() {
		Scanner g=new Scanner(System.in);
		System.out.println("请输入您的出生月份");
		Scanner h=new Scanner(System.in);
		System.out.println("请输入您的出生日份");
int p=g.nextInt();
int l=h.nextInt();
gg(p,l);
ff(p,l);
}
	static void jj() {
		Scanner g=new Scanner(System.in);
		System.out.println("请输入当前的月份");
		Scanner h=new Scanner(System.in);
		System.out.println("请输入当前的日份");
int p=g.nextInt();
int l=h.nextInt();
gg(p,l);
ff(p,l);
	}
	static void gg(int a,int b) {
		if(a>12) {
			System.out.println("输入月份错误，请重新输入：");
			Scanner g=new Scanner(System.in);
			System.out.println("请输入当前的月份");
			int p=g.nextInt();
		}
		if(b>31) {
			System.out.println("输入日分有误，请重新输入：");
			Scanner h=new Scanner(System.in);
			System.out.println("请输入当前的日份");
			int l=h.nextInt();
			
		}
	}
	static void ff(int a,int b)
	{
	switch(a) {
	case 1:
		if(b<=19) {
			System.out.println("当前月份星座是摩羯座，今日摩羯座的整体运势较为积极，你能够在工作中大展身手，让大家都很赞许你的工作态度。在感情运势方面表现尚可，你会不太懂得另一半的点，造成彼此的信息交流失误。");
		}
		else {
			System.out.println("当前星座是水瓶座，今日水瓶座的整体运势较为平顺，你在工作或生活中可能会比较强势，让自己陷入被动境地。在感情运势方面表现尚可，你希望对方能够为你而改变，但是可能运用的方式不对。");
		}
		break;
	case 2:
		if(b<=18) {
			System.out.println("当前星座是水瓶座，今日水瓶座的整体运势较为平顺，你在工作或生活中可能会比较强势，让自己陷入被动境地。在感情运势方面表现尚可，你希望对方能够为你而改变，但是可能运用的方式不对。");
		}
		else {
			System.out.println("当前星座是双鱼座，今日双鱼座的整体运势大致良好，今天你的获得感很强，能够得到自己想要的事物。在感情运势方面表现不错，另一半会为你准备小惊喜，让你颇感满足。在事业运势方面表现上佳");
		}break;
	case 3:
		if(b<=20) {
			System.out.println("当前星座是双鱼座，今日双鱼座的整体运势大致良好，今天你的获得感很强，能够得到自己想要的事物。在感情运势方面表现不错，另一半会为你准备小惊喜，让你颇感满足。在事业运势方面表现上佳");
		}
		else {
			System.out.println("当前星座为白羊座，今日白羊座的整体运势较为普通，工作任务的繁重让你的心情和身体状况都会受到影响。在感情运势方面表现尚可，今天在感情方面可能会无暇顾及对方的情绪。");
		}break;
	case 4:
		if(b<=19) {
			System.out.println("当前星座为白羊座，今日白羊座的整体运势较为普通，工作任务的繁重让你的心情和身体状况都会受到影响。在感情运势方面表现尚可，今天在感情方面可能会无暇顾及对方的情绪。");
		}
		else {
			System.out.println("当前星座为金牛座，今日金牛座的整体运势大体良好，你今天能和朋友进行聊天欢聚活动，会通过倾诉消除自己的烦恼。在感情运势方面表现不错，和另一半在热情洋溢的团队氛围中也显得异常恩爱。");
		}break;
	case 5:
		if(b<=20) {
			System.out.println("当前星座为金牛座，今日金牛座的整体运势大体良好，你今天能和朋友进行聊天欢聚活动，会通过倾诉消除自己的烦恼。在感情运势方面表现不错，和另一半在热情洋溢的团队氛围中也显得异常恩爱。");
		}
		else {
			System.out.println("当前月份星座为双子座，今日双子座的整体运势较为顺遂，今天的你又细心又聪慧，能够解决许多人际方面的问题。在感情运势方面表现不错，今天的你对另一半特别的细心体贴，让对方感受到你的爱意");
		}break;
	case 6:
		if(b<=21) {
			System.out.println("当前月份星座为双子座，今日双子座的整体运势较为顺遂，今天的你又细心又聪慧，能够解决许多人际方面的问题。在感情运势方面表现不错，今天的你对另一半特别的细心体贴，让对方感受到你的爱意");
		}
		else {
			System.out.println("当前月份星座为巨蟹座，今日巨蟹座的整体运势大体尚可，你可能会被某个人误会，但是又无法清楚地表达自己。在感情运势方面表现较好，另一半能够给你很多安慰，你也习惯了依赖他");
		}break;
	case 7:
		if(b<=22) {
			System.out.println("当前月份星座为巨蟹座，今日巨蟹座的整体运势大体尚可，你可能会被某个人误会，但是又无法清楚地表达自己。在感情运势方面表现较好，另一半能够给你很多安慰，你也习惯了依赖他");
		}
		else {
			System.out.println("当前月份星座为狮子座，今日狮子座的整体运势表现比较一般，在情绪方面容易冲动，今天要收敛一下自己火爆脾气。在感情运势方面表现较好，另一半十分地包容和体谅你。在事业运势方面表现普通，");
		}break;
	case 8:
		if(b<=22) {
			System.out.println("当前月份星座为狮子座，今日狮子座的整体运势表现比较一般，在情绪方面容易冲动，今天要收敛一下自己火爆脾气。在感情运势方面表现较好，另一半十分地包容和体谅你。在事业运势方面表现普通，");
		}
		else {
			System.out.println("当前月份星座为处女座，今日处女座的整体运势较为不错，虽然你认真而严肃，但是今天周围人都能感受到你的亲和力。在感情运势方面表现良好，单身的处女座今天能够散发自己的自然魅力。");
		}break;
	case 9:
		if(b<=22) {
			System.out.println("当前月份星座为处女座，今日处女座的整体运势较为不错，虽然你认真而严肃，但是今天周围人都能感受到你的亲和力。在感情运势方面表现良好，单身的处女座今天能够散发自己的自然魅力。");
		}
		else {
			System.out.println("当前月份星座为天秤座，今日天秤座的整体运势较为平顺，你习惯于展示自己的长处，但要小心今天会遭人诟病。在感情运势方面表现不错，和另一半会进行一些创意约会。在事业运势方面表现尚好");
		}break;
	case 10:
		if(b<=23) {
			System.out.println("当前月份星座为天秤座，今日天秤座的整体运势较为平顺，你习惯于展示自己的长处，但要小心今天会遭人诟病。在感情运势方面表现不错，和另一半会进行一些创意约会。在事业运势方面表现尚好");
		}
		else {
			System.out.println("当前月份星座为天蝎座，今日天蝎座的整体运势大致良好，你会习惯和大家分享自己的心情点滴，内心充满温情。在感情运势方面表现较好，你和另一半很懂得适时的沟通，彼此心意相通");
		}break;
	case 11:
		if(b<=22) {
			System.out.println("当前月份星座为天蝎座，今日天蝎座的整体运势大致良好，你会习惯和大家分享自己的心情点滴，内心充满温情。在感情运势方面表现较好，你和另一半很懂得适时的沟通，彼此心意相通");
		}
		else {
			System.out.println("当前月份星座为射手座，今日射手座的整体运势大体向好，在感情方面也有了新的期待。在感情运势方面表现较好，单身的射手座会发现自己身边有值得交往的对象。在事业运势方面表现尚佳");
		}break;
	case 12:
		if(b<21) {
			System.out.println("当前月份星座为射手座，今日射手座的整体运势大体向好，在感情方面也有了新的期待。在感情运势方面表现较好，单身的射手座会发现自己身边有值得交往的对象。在事业运势方面表现尚佳");
		}
		else {
			System.out.println("当前月份星座是摩羯座，今日摩羯座的整体运势较为积极，你能够在工作中大展身手，让大家都很赞许你的工作态度。在感情运势方面表现尚可，你会不太懂得另一半的点，造成彼此的信息交流失误。");
		}break;
	}
	}
}
