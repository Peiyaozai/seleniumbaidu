package day6;
abstract class Door{
	 void  openDoor() {} ;
 void  closeDoor() {} ;
}
class x1 extends Door implements gongneng{
	void openDoor() {
		System.out.println("����");
		}
	void closeDoor() {
		System.out.println("����");
	}
	
		public void theftproof() {
			System.out.println(biaoyu+"����");
		}
	
	public void waterproof() {
		System.out.println(biaoyu+"��ˮ");
	}
		public void bulletproof() {
			System.out.println(biaoyu+"����");
		}
		public void fhproof() {
			System.out.println(biaoyu+"����");
		}
		public void fxproof() {
			System.out.println(biaoyu+"����");
		}
		
	}
	
interface gongneng{
	String biaoyu="����";
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
