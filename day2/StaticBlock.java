package WileyProject;

public class StaticBlock {
	static int a;
	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Instance Block");
	}
	public StaticBlock() {
		System.out.println("Inside constructor Block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StaticBlock();
		new StaticBlock();
		new StaticBlock();

	}

}
