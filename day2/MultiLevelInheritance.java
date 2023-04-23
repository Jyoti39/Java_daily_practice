package WileyProject;
class vehicle{
	public void tier() {
		System.out.println("tier");
	}
	public void steering() {
		System.out.println("steering");
	}
	public void airBag() {
		System.out.println("airBag");
	}
	
}
class car extends vehicle{
	public void airBag() {
		System.out.println("airBag");
	}
}
class Smartcar extends car{
	public void sensor() {
		System.out.println("sensor");
	}
}
public class MultiLevelInheritance {
	public static void main(String[] args) {
		
  Smartcar sc=new Smartcar();
  sc.sensor();
  
  sc.airBag();
  sc.steering();
}
}

