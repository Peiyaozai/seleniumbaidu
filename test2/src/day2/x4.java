package day2;

public class x4 {
	
		public static void main(String[] args) {
			int i=1,sum=0;
			while(i<=200) {
				if(i%3==0) {
					sum+=i;
					i++;
				}
				else {
					i++;
				}
			}
	System.out.println("1~200 之间所有 3 的倍数之和："+sum);
		}

	}


