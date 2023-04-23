package WileyProject;
class A{

	public void steering() {
		System.out.println("steering");
	}
	
}
class B extends A{
	public void airBag() {
		System.out.println("airBag");
	}
}

class C extends A{
	public  void HydraulicPump() {
		System.out.println("HydraulicPump");
	}
}
class D extends B{
	public void mirror() {
		System.out.println("mirror");
	}
}
class E extends D{
	public void gate() {
		System.out.println("gate");
	}
}



public class HybridInheritance {
	public static void main(String[] args) {
		E e = new E();
		e.steering();
		e.mirror();
		C c = new C();
		c.HydraulicPump();
		
		
		
	}

}
