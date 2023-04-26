package Random;
import java.io.Console;
public class ConcoleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Console console=System.console();
        if(console==null) {
        	System.out.println("Console is not availble");
        	System.exit(1);
        }
        String name=console.readLine("what is your name: ");
        char[] password=console.readPassword("Enter Your password: ");
        	console.printf("Hello, %s\n",name);
        			console.printf("Your password is:, %s\n ", new String(password));
        					
	}

}
