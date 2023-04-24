package Exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("first statement");
		int arr[]= {1,2,3,4};
		try {
			System.out.println(arr[1]);
			System.out.println(arr[4]);
			// when exception occurrs it go outside the try block
			System.out.println("Simple statement");
			String str="jyoti";
			System.out.println(str.charAt(8));
			System.out.println(12/0);
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			// Exception is the parent of all the exceptions
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}catch(IndexOutOfBoundsException e) {
			System.out.println("catch block 2");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Catch Block 3");
			e.printStackTrace();
		}
		
		System.out.println("Another statement");
 
	}

}
