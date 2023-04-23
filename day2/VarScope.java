package WileyProject;

public class VarScope {
	//instance variable
 int ins=20;
 //static variable
 static String name="Jyoti";
 int val=18;
 int val1=12;
 public void sum() {
	 int val=10;
	 int val1=25;
	 System.out.println("sum methods: "+(this.val +this.val1));
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //local variable;
		int val=18;
		int loc=10;
		VarScope vso=new VarScope();
		//System.out.println("Local variable val: "+this.val);
		System.out.println("Local variable loc: "+loc);
		System.out.println("Instance variableins: "+vso.ins);
		System.out.println("Static variable name: "+name);
		vso.sum();
	}

}

