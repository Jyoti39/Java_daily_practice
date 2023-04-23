package WileyProject;
class test{
	public static int add(int v1,int v2) {
		int val=v1+v2;
		return val;
	}
}
public class MethodType {
	public void add(int v1,int v2) {
		int val=v1+v2;
		System.out.println("Addition in instance methods: "+val);
		//we can call the substraction method inside the 
		this.sub(20, 10);
	}
	public void sub(int v1,int v2) {
		int val=v1-v2;
		System.out.println("substraction in instance methods: "+val);
	}

	//public static void mul(int v1,int v2) {
		//int val=v1*v2;
		//System.out.println("Multiplication in static method : "+val);
	
public static int mul(int v1,int v2) {
	int val=v1*v2;
	//System.out.println("Multiplication in static method : "+val);
	return val;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int m= mul(10,20);
      System.out.println(m);
       MethodType mt=new MethodType();
       mt.add(10,20);
       System.out.println("calling test class: "+test.add(15,18));
	}

}
