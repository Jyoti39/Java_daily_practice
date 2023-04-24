package Exceptions;

public class FinalBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("1111");
			System.out.println("wiley");
			try {
				System.out.println(10/0);
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				System.out.println("nested try catch");
			}
			
		}
		catch(Exception e) {
			System.out.println("catch block");
			//System.exit(0);
			//System.out.println(10/0);
			//e.printStackTrace();
		}
		finally {
			//System.out.println(10/0);
			System.out.println("close connection");
		}

	}
	

}
