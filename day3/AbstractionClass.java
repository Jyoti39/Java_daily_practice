package WileyProject;

abstract class Test1{
	{
		System.out.println("Test1 instance block");
	}
	static {
		{
			System.out.println("Test1 static block");
		}
	}
	public abstract void m1(); 
		
	public void m2() {
		System.out.println("Test1 m2 method");
	}
	// we can create main in abstract class
	public static void main(String[] args) {
		System.out.println("Main abstract class");
	}
	// creating the constructor in abstract class
	public Test1() {
		System.out.println("Test1 constructor");
	}
	static{
		System.out.println("Test2 static block");
	}
}
class Test2 extends Test1{
	{
		System.out.println("Test2 instance block");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Test2 m1 method");
	}
	public Test2() {
		System.out.println("Test 2 constructor");
	}
	
}
public class AbstractionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Test2 t2= new Test2();
       t2.m1();
       t2.m2();
       Test1.main(args);
	}

}
