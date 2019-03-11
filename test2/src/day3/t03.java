package day3;

public class t03 {
	
		int a;
		int b;
		int c;
		
		
	
	public int getA() {
			return a;
		}

		public int getB() {
			return b;
		}

		public int getC() {
			return c;
		}

		public void setA(int a) {
			this.a = a;
		}

		public void setB(int b) {
			this.b = b;
		}
		public void setC(int c) {
			this.c = c;
		}



	void chang() {
		System.out.println("此三角形的周长为："+(a+b+c));
	}
	
}
