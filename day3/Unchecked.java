package Exceptions;

import java.util.ArrayList;
class StringNotFound extends RuntimeException{
	public StringNotFound(String message) {
		super(message);
	}
}
public class Unchecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> students = new ArrayList<>();
      students.add("venkat");
      students.add("Jyoti");
      students.add("anjali");
      if(!students.contains("venkat")) {
    	  try {
    		  throw new StringNotFound("This string is not found");
    	  }catch(StringNotFound e) {
    		  e.printStackTrace();
    	  }
      }
   
      System.out.println("Message one");
      System.out.println("Message two");
      
	}

}
