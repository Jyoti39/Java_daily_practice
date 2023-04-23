package WileyProject;

public class ConstructorTypes {
	public ConstructorTypes(int a,int b) {
		System.out.println("2 args count:" +(a+b));
	}
	public ConstructorTypes() {
		System.out.println("0 args count:" );
	}
	public ConstructorTypes(float a,float b) {
		this(2,7);
		System.out.println("2 args with float count:" +(a+b));
	}
	public void add() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorTypes ct = new ConstructorTypes();
		ConstructorTypes ct1 = new ConstructorTypes(10,20);

		ConstructorTypes ct2 = new ConstructorTypes(10.5f,20.5f);


	}

}
