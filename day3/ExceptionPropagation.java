package Exceptions;

public class ExceptionPropagation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		}catch (Exception e) {
			System.out.println("Exception caught " +e.getMessage());
		}

	}
	public static void method1()throws Exception{
		method2();
	}
	public static void method2() throws Exception{
		throw new Exception ("Exception occures in the method2");
	}

}
