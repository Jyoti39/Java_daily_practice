package WileyProject;

public class InstanceOrder {
	//Instance block
	String name;
	int age;
	{
		name="Jyoti";
		age=21;
		System.out.println("Instance block");
		
	}
	public InstanceOrder() {
		System.out.println("Name: "+name +"Age:"+age);
		System.out.println("Constructor Block");
	}
	public InstanceOrder(int a,int b) {
		System.out.println("Constructor Parametrized: " +(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceOrder ior=new InstanceOrder();
		new InstanceOrder(2,3);
	}

}

