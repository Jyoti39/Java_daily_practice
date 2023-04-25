package StringClass;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer chatHistory=new StringBuffer();
		String sender="Jyoti";
		String message="Hey Sachin!";
		chatHistory.append(sender);
		chatHistory.append(": ");
		chatHistory.append(message);
		chatHistory.append("\n");
		 sender="Sachin";
		 message="Hey Jyoti";
			chatHistory.append(sender);
			chatHistory.append(": ");
			chatHistory.append(message);
			chatHistory.append("\n");
			System.out.println(chatHistory);
	}

}
