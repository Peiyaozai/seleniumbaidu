package day6;
abstract class Door{
	 void  openDoor() {} ;
 void  closeDoor() {} ;
}
class x1 extends Door implements gongneng{
	void openDoor() {
		System.out.println("开门");
		}
	void closeDoor() {
		System.out.println("关门");
	}
	
		public void theftproof() {
			System.out.println(biaoyu+"防盗");
		}
	
	public void waterproof() {
		System.out.println(biaoyu+"防水");
	}
		public void bulletproof() {
			System.out.println(biaoyu+"防弹");
		}
		public void fhproof() {
			System.out.println(biaoyu+"防火");
		}
		public void fxproof() {
			System.out.println(biaoyu+"防锈");
		}
		
	}
	
interface gongneng{
	String biaoyu="此门";
	void theftproof();
	void waterproof();
	void bulletproof();
	void fhproof();
	void fxproof();
}

public class M2 {

	public static void main(String[] args) {
x1 h=new x1();
h.openDoor();
h.closeDoor();
h.theftproof();
h.waterproof();
h.bulletproof();
h.fhproof();
h.fxproof();

	}

}
