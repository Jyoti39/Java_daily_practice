package StringClass;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder logMessage=new StringBuilder();
		long timestamp=System.currentTimeMillis();
		logMessage
		   .append("[")
		.append("timestamp")
		.append("}");
		int userId=123456;
		logMessage
		.append("User")
		.append("userId")
		.append(": ");
		String message="Login Successfully";
		logMessage.append(message);
		System.out.println(logMessage);
		

	}

}
