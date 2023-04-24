package Exceptions;

class AgeNotValid extends Exception{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		//return super.getMessage();
		return "this age is not valid";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return "age is not applicable";
	}

	@Override
	public StackTraceElement[] getStackTrace() {
		// TODO Auto-generated method stub
		return super.getStackTrace();
	}

	public AgeNotValid(String message) {
		super(message);
	}
}
public class CustomException {
	public static void getAge(int age) {
		if(age>18) {
			try {
				throw new AgeNotValid("Age not valid");
			}catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.toString());
				e.printStackTrace();
			}
		}else {
			System.out.println("Age valid");
		}
	}

	public static void main(String[] args)throws AgeNotValid {
		// TODO Auto-generated method stub
      getAge(21);
	}

}
